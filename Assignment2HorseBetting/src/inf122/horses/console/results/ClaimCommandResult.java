package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class ClaimCommandResult implements CommandResult
{
	public ClaimCommandResult()
	{
		
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "WOOT";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
