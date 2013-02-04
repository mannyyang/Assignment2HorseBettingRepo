// ShowCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the SHOW command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;
import java.util.Set;


public class ShowCommand extends SingleHorseBetCommand
{
	public ShowCommand(int horseNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		super(horseNumber, amountPerHorse, horseNumbers);
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
}
