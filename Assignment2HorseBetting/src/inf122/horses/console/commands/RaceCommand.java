// RaceCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the RACE command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.RaceCommandResult;
import inf122.horses.console.state.RacetrackState;

import java.util.Set;


public class RaceCommand implements Command
{
	public RaceCommand(int raceNumber, Set<String> horseNumbers)
	{
		this.raceNumber = raceNumber;
		this.horseNumbers = horseNumbers;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		state.addRace(raceNumber, horseNumbers);
		return new RaceCommandResult(raceNumber, horseNumbers);
	}
	
	
	private int raceNumber;
	private Set<String> horseNumbers;
}
