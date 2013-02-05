package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class ReachedPostTimeCommandResult implements CommandResult
{
	private int raceID;
	
	public ReachedPostTimeCommandResult(int raceID)
	{
		this.raceID = raceID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Race #" + raceID + " post time has been reached, no more bets are allowed.";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

	
}
