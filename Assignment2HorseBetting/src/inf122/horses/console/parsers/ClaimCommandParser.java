// ClaimCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the CLAIM command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.ClaimCommand;
import inf122.horses.console.commands.Command;


class ClaimCommandParser extends BaseKnownCommandParser
{
	public ClaimCommandParser()
	{
		ticketIdWordParser = new TicketIdWordParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		
		int ticketId = ticketIdWordParser.parse(commandWords[1]);
		
		return new ClaimCommand(ticketId);
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"CLAIM <ticketID>",
			"    ticketID - ticket ID of ticket to claim"
		};
	}
	
	
	private TicketIdWordParser ticketIdWordParser;
}
