package inf122.horses.console.results;

import inf122.horses.console.state.RacetrackState;

import java.util.Arrays;
import java.util.List;

import uci.inf122.assignment2HorseBetting.Race;

public class PostCommandResult implements CommandResult
{
	private Race race;
	
	public PostCommandResult(int raceID, RacetrackState state)
	{
		race = state.getRace(raceID);
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		if (race.getPostTime())
		{
			String s = "Post time has been reached for race " + race.getRaceID() + " no more bets on this race will be accepted.";
			return Arrays.asList(s);
		}
		else
		{
			return Arrays.asList("It is not in Post time yet!");
		}
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
