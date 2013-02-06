package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class ResultsNotPostedCommandResult implements CommandResult
{
	private int raceID;
	
	public ResultsNotPostedCommandResult(int raceID)
	{
		this.raceID = raceID;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Results have not yet been posted for Race ID#" + raceID + ". Please try again!";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
