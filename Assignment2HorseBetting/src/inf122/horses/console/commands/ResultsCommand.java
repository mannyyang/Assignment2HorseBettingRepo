// ResultsCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the RESULTS command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.NoHorseFoundCommandResult;
import inf122.horses.console.results.NoRaceFoundCommandResult;
import inf122.horses.console.results.ResultsCommandResult;
import inf122.horses.console.state.RacetrackState;
import uci.inf122.assignment2HorseBetting.Race;


public class ResultsCommand implements Command
{
	public ResultsCommand(
		int raceNumber, String firstHorse,
		String secondHorse, String thirdHorse)
	{
		this.raceNumber = raceNumber;
		this.firstHorse = firstHorse;
		this.secondHorse = secondHorse;
		this.thirdHorse = thirdHorse;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		if (state.doesRaceExist(raceNumber))
		{
			Race race = state.getRace(raceNumber);
			
			if (race.doesHorseExist(firstHorse) && race.doesHorseExist(secondHorse) && race.doesHorseExist(thirdHorse))
			{
				race.setFirstPlace(race.getHorse(firstHorse));
				race.setSecondPlace(race.getHorse(secondHorse));
				race.setThirdPlace(race.getHorse(thirdHorse));
				
				return new ResultsCommandResult(race);
			}
			else
			{
				return new NoHorseFoundCommandResult(raceNumber);
			}
		}
		else
		{
			return new NoRaceFoundCommandResult(raceNumber);
		}
	}
	
	
	private int raceNumber;
	private String firstHorse;
	private String secondHorse;
	private String thirdHorse;
}
