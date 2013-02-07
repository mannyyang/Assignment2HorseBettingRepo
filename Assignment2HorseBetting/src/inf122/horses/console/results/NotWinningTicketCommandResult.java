package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NotWinningTicketCommandResult implements CommandResult
{
	private int ticketID;
	
	public NotWinningTicketCommandResult(int ticketID)
	{
		this.ticketID = ticketID;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Sorry, Ticket ID#" + ticketID + " is not a winning ticket.";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}
	
}
