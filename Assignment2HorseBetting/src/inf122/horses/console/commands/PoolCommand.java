// PoolCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Implements the POOL command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.NoRaceFoundCommandResult;
import inf122.horses.console.results.PoolCommandResult;
import inf122.horses.console.state.RacetrackState;

import java.util.Set;

import uci.inf122.assignment2HorseBetting.Horse;
import uci.inf122.assignment2HorseBetting.Race;

public class PoolCommand implements Command
{
	public PoolCommand(BetType betType, int raceNumber)
	{
		this.betType = betType;
		this.raceNumber = raceNumber;
	}

	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		if (state.doesRaceExist(raceNumber))
		{
			String results = "";
			Race race = state.getRace(raceNumber);
			Set<String> horses = race.getHorses();
			for (String horse : horses)
			{
				Horse hor = race.getHorse(horse);
				int amt = hor.getTotalAmount(betType);
				results = results + "Horse #" + horse + " for Pool:[" + betType.toString() + "] Total Amount: [" + amt + "]";
				results += "\n";
			}
			return new PoolCommandResult(results);
		}
		else
		{
			return new NoRaceFoundCommandResult(raceNumber);
		}
	}

	private BetType betType;
	private int raceNumber;
}
