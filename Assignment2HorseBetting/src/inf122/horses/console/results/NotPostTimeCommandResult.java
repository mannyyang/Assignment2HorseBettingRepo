package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NotPostTimeCommandResult implements CommandResult
{
	private int raceID;
	
	public NotPostTimeCommandResult(int raceID)
	{
		this.raceID = raceID;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Race #" + raceID + " has not reached its post time yet, please try again!";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
