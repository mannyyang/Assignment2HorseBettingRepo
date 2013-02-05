package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class PoolCommandResult implements CommandResult
{
	private String result;
	
	public PoolCommandResult(String result)
	{
		this.result = result;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		return Arrays.asList(result);
	}

	@Override
	public boolean stopConsole()
	{
		return false;
	}

	
}
