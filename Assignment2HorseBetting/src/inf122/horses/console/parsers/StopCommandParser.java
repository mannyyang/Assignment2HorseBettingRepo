// StopCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the STOP command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.StopCommand;


class StopCommandParser implements KnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		return new StopCommand();
	}
}
