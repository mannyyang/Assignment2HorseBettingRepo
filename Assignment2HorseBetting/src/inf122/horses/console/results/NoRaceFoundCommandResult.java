package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NoRaceFoundCommandResult implements CommandResult
{
	private int raceID;
	
	public NoRaceFoundCommandResult(int raceID)
	{
		this.raceID = raceID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Race ID " + raceID + " not found in Racetrack, Please try again!";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
