// TakeCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the TAKE command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.TakeCommandResult;
import inf122.horses.console.state.RacetrackState;


public class TakeCommand implements Command
{
	public TakeCommand(int takePercentage)
	{
		if (takePercentage < 0 || takePercentage > 100)
		{
			throw new IllegalArgumentException("takePercentage must be between 0 and 100");
		}
		
		this.takePercentage = takePercentage;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		state.setTakeAmount(takePercentage);
		System.out.println(state.getTakeAmount());
		return new TakeCommandResult(state);
	}
	
	
	private int takePercentage;
}
