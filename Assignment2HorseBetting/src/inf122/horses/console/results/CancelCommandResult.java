package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class CancelCommandResult implements CommandResult
{
	private int ticketID;

	public CancelCommandResult(int ticketID)
	{
		this.ticketID = ticketID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Ticket #" + ticketID + " has been cancelled and removed";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}
	

}
