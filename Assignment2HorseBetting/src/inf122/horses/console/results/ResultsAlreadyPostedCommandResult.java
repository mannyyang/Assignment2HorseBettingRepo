package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class ResultsAlreadyPostedCommandResult implements CommandResult
{
	private int raceID;
	
	public ResultsAlreadyPostedCommandResult(int raceID)
	{
		this.raceID = raceID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Results for Race ID#" + raceID + " has already been posted. Please try again.";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
