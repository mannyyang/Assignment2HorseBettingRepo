// PoolCommandParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses the POOL command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.BetType;
import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.PoolCommand;


class PoolCommandParser extends BaseKnownCommandParser
{
	public PoolCommandParser()
	{
		betTypeWordParser = new BetTypeWordParser();
		raceNumberWordParser = new RaceNumberWordParser();
	}
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 3)
		{
			return parseFailure();
		}
		
		BetType betType = betTypeWordParser.parse(commandWords[1]);
		int raceNumber = raceNumberWordParser.parse(commandWords[2]);
		
		return new PoolCommand(betType, raceNumber);
	}

	protected String[] getFormatMessages()
	{
		return new String[] {
			"POOL <betType> <race#>",
			"    betType - The type of bet (WIN, PLACE, SHOW)",
			"    race#   - Race # for which to view pool"
		};
	}

	private BetTypeWordParser betTypeWordParser;
	private RaceNumberWordParser raceNumberWordParser;
}
