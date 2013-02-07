// ClaimCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the CLAIM command

package inf122.horses.console.commands;

import inf122.horses.console.results.ClaimCommandResult;
import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.NoTicketFoundCommandResult;
import inf122.horses.console.results.NotPostTimeCommandResult;
import inf122.horses.console.results.NotWinningTicketCommandResult;
import inf122.horses.console.results.ResultsNotPostedCommandResult;
import inf122.horses.console.results.TicketClaimedCommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;

import java.util.ArrayList;

import uci.inf122.assignment2HorseBetting.Race;
import uci.inf122.assignment2HorseBetting.Ticket;

public class ClaimCommand implements Command
{
	private ArrayList<Ticket> pool;
	private double takeAmount;
	private int poolTotalAmount;
	private int horseTotalAmount;
	private int ticketBetAmount;
	private double winnings;

	public ClaimCommand(int ticketId)
	{
		this.ticketId = ticketId;
		poolTotalAmount = 0;
		horseTotalAmount = 0;
		ticketBetAmount = 0;
		winnings = 0.00;
	}

	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		if (state.doesTicketExist(ticketId))
		{
			Ticket ticket = state.getTicket(ticketId);
			Race race = ticket.getRace();
			takeAmount = state.getTakeAmount();

			if (ticket.isClaimed())
			{
				return new TicketClaimedCommandResult(ticketId);
			}
			else
			{
				if (race.getPostTime())
				{
					if (race.isResultsShown())
					{
						BetType betType = ticket.getBetType();
						String horseNumber = ticket.getHorseNumber();
						
						if (race.getFirstPlace().getHorseNumber().equals(horseNumber) || 
								race.getSecondPlace().getHorseNumber().equals(horseNumber) ||
								race.getThirdPlace().getHorseNumber().equals(horseNumber))
						{
							switch (betType)
							{
							case WIN:

								if (race.getFirstPlace().getHorseNumber().equals(horseNumber))
								{
									pool = race.getWinPool();
									poolTotalAmount = race.getTotalPoolAmount(BetType.WIN);
									ticketBetAmount = ticket.getBetAmount();

									for (Ticket tick : pool)
									{
										if (horseNumber.equals(tick.getHorseNumber()))
										{
											horseTotalAmount += tick.getBetAmount();
										}
									}
									
									System.out.println(takeAmount/100);
									double actualTotal = poolTotalAmount - ((takeAmount/100)*poolTotalAmount);
									double profit = actualTotal - horseTotalAmount;
									double dividends = profit/horseTotalAmount;
									winnings = (1 + dividends) * ticketBetAmount;
									
									return new ClaimCommandResult(winnings);
								}
								else
								{
									ticket.setClaimed(true);
									return new NotWinningTicketCommandResult(ticketId);
								}
							case PLACE:
								return new UnimplementedCommandResult();
							case SHOW:
								return new UnimplementedCommandResult();
							default:
								return new UnimplementedCommandResult();
							}
						}
						else
						{
							ticket.setClaimed(true);
							return new NotWinningTicketCommandResult(ticketId);
						}
					}
					else
					{
						return new ResultsNotPostedCommandResult(race.getRaceID());
					}
				}
				else
				{
					return new NotPostTimeCommandResult(race.getRaceID());
				}
			}
		}
		else
		{
			return new NoTicketFoundCommandResult(ticketId);
		}
	}

	private int ticketId;
}
