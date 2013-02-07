package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class TicketClaimedCommandResult implements CommandResult
{
	private int ticketID;

	public TicketClaimedCommandResult(int ticketID)
	{
		this.ticketID = ticketID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Ticket ID#" + ticketID + " has already been claimed, Please try again.";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
