package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class RaceExistsCommandResult implements CommandResult
{
	private int raceID;
	
	public RaceExistsCommandResult(int raceID)
	{
		this.raceID = raceID;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Race ID#: " + raceID + " already exists in the system, please try again!";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}
	
}
