package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

import uci.inf122.assignment2HorseBetting.Race;

public class ResultsCommandResult implements CommandResult
{
	private Race race;
	
	public ResultsCommandResult(Race race)
	{
		this.race = race;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "For Race #" + race.getRaceID() + 
				", first place is horse #: " + race.getFirstPlace().getHorseNumber() +
				", second place is horse #: "  + race.getSecondPlace().getHorseNumber() +
				", third place is horse #: " + race.getThirdPlace().getHorseNumber();
				
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
