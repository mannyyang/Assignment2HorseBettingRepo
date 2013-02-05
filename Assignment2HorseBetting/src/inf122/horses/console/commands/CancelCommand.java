// CancelCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the CANCEL command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.ReachedPostTimeCommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;
import uci.inf122.assignment2HorseBetting.Ticket;


public class CancelCommand implements Command
{
	public CancelCommand(int ticketId)
	{
		this.ticketId = ticketId;
	}


	public CommandResult execute(RacetrackState state)
	{
		Ticket ticket = state.getTicket(ticketId);
		
		// Inf122TBD: Return an actual result
		if (ticket.getRace().getPostTime())
		{
			return new ReachedPostTimeCommandResult(ticket.getRace().getRaceID());
		}
		else
		{
			state.cancelBet(ticketId);
			return new UnimplementedCommandResult();
		}
	}


	private int ticketId;
}
