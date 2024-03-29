// PlaceCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the PLACE command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.PlaceCommand;
import java.util.Set;


class PlaceCommandParser extends SingleHorseBetCommandParser
{
	protected String getBetType()
	{
		return "PLACE";
	}
	
	
	protected Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		return new PlaceCommand(raceNumber, amountPerHorse, horseNumbers);
	}
}
