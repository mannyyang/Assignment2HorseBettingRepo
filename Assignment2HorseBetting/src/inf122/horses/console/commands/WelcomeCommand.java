// WelcomeCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the WELCOME command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.WelcomeCommandResult;
import inf122.horses.console.state.RacetrackState;


public class WelcomeCommand implements Command
{
	public CommandResult execute(RacetrackState state)
	{
		return new WelcomeCommandResult();
	}
}
