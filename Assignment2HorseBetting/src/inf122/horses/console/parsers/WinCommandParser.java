// WinCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the WIN command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.WinCommand;
import java.util.Set;


class WinCommandParser extends SingleHorseBetCommandParser
{
	protected String getBetType()
	{
		return "WIN";
	}
	
	
	protected Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		return new WinCommand(raceNumber, amountPerHorse, horseNumbers);
	}
}
