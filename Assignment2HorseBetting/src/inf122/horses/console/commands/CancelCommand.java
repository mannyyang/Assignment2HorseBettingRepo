// CancelCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the CANCEL command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;


public class CancelCommand implements Command
{
	public CancelCommand(int ticketId)
	{
		this.ticketId = ticketId;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int ticketId;
}
