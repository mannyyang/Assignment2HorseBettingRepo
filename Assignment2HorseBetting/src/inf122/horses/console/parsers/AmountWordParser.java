// AmountWordParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Word parser that parses amounts (e.g., an amount of a bet)

package inf122.horses.console.parsers;


public class AmountWordParser extends RangedIntegerWordParser
{
	public AmountWordParser()
	{
		super(1, Integer.MAX_VALUE);
	}
}
