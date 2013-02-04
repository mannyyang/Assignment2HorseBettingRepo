package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NoHorseFoundCommandResult implements CommandResult
{
	private int raceID;
	
	public NoHorseFoundCommandResult(int raceID)
	{
		this.raceID = raceID;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "One of the horse numbers were not found in Race # " + raceID;
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
