package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;

public class NoTicketFoundCommandResult implements CommandResult
{
	private int ticketID;
	
	public NoTicketFoundCommandResult(int ticketID)
	{
		this.ticketID = ticketID;
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Ticket ID#" + ticketID + "not found in the system, please try again";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
