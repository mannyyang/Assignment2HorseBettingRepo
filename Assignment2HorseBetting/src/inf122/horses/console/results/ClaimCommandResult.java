package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class ClaimCommandResult implements CommandResult
{
	private double winnings;
	
	public ClaimCommandResult(double winnings)
	{
		this.winnings = winnings;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = Double.toString(winnings);
		String string = "Congratulations, you won $" + s + "."; 				
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
