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
import inf122.horses.console.results.ResultsNotPostedCommandResult;
import inf122.horses.console.state.RacetrackState;
import uci.inf122.assignment2HorseBetting.Race;
import uci.inf122.assignment2HorseBetting.Ticket;


public class ClaimCommand implements Command
{
	public ClaimCommand(int ticketId)
	{
		this.ticketId = ticketId;
	}


	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		if (state.doesTicketExist(ticketId))
		{
			Ticket ticket = state.getTicket(ticketId);
			Race race = ticket.getRace();
			
			if (race.getPostTime())
			{
				if (race.isResultsShown())
				{
					return new ClaimCommandResult();
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
		else
		{
			return new NoTicketFoundCommandResult(ticketId);
		}
	}

	private int ticketId;
}
