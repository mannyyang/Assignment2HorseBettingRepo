// BetTypeWordParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parses a single word that is expected to be a BetType.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.BetType;


public class BetTypeWordParser implements WordParser<BetType>
{
	public BetType parse(String word)
	{
		if (word.equals("WIN"))
		{
			return BetType.WIN;
		}
		else if (word.equals("PLACE"))
		{
			return BetType.PLACE;
		}
		else if (word.equals("SHOW"))
		{
			return BetType.SHOW;
		}
		else
		{
			throw new IllegalArgumentException("Invalid bet type");
		}
	}
}
