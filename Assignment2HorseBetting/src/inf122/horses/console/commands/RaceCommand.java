// RaceCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the RACE command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.NotEnoughHorsesCommandResult;
import inf122.horses.console.results.RaceCommandResult;
import inf122.horses.console.results.RaceExistsCommandResult;
import inf122.horses.console.state.RacetrackState;

import java.util.Set;

import uci.inf122.assignment2HorseBetting.Race;


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
		// takes the current racetrack state and adds a new race with given raceID and set of horses.
		if (state.doesRaceExist(raceNumber))
		{
			return new RaceExistsCommandResult(raceNumber);
		}
		else
		{
			if (horseNumbers.size() < 3)
			{
				return new NotEnoughHorsesCommandResult();
			}
			else
			{
				state.addRace(new Race(raceNumber, horseNumbers));
				return new RaceCommandResult(raceNumber, state);
			}
		}
	}

	private int raceNumber;
	private Set<String> horseNumbers;
}
