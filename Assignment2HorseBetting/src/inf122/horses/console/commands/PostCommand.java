// PostCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the POST command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.NoRaceFoundCommandResult;
import inf122.horses.console.results.PostCommandResult;
import inf122.horses.console.state.RacetrackState;


public class PostCommand implements Command
{
	public PostCommand(int raceNumber)
	{
		this.raceNumber = raceNumber;
	}
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		if (state.doesRaceExist(raceNumber))
		{
			state.getRace(raceNumber).setPostTimeOn();
			return new PostCommandResult(raceNumber, state);
		}
		else
		{
			return new NoRaceFoundCommandResult(raceNumber);
		}
	}
	
	private int raceNumber;
}
