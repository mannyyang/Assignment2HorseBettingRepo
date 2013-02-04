// ShowCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the SHOW command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.ShowCommand;
import java.util.Set;


class ShowCommandParser extends SingleHorseBetCommandParser
{
	protected String getBetType()
	{
		return "SHOW";
	}
	
	
	protected Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		return new ShowCommand(raceNumber, amountPerHorse, horseNumbers);
	}
}
