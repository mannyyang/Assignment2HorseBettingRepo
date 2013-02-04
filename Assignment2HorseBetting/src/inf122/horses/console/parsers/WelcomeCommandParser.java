// WelcomeCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the WELCOME command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.WelcomeCommand;


class WelcomeCommandParser implements KnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		return new WelcomeCommand();
	}
}
