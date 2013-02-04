// StopCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the STOP command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.StopCommandResult;
import inf122.horses.console.state.RacetrackState;


public class StopCommand implements Command
{
	public CommandResult execute(RacetrackState state)
	{
		return new StopCommandResult();
	}
}
