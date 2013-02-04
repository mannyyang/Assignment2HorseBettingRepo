package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NotEnoughHorsesCommandResult implements CommandResult
{

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Need to enter at least three horses, please try again!";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
