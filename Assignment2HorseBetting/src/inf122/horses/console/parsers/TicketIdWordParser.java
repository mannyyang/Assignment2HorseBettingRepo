// TicketIdWordParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// A word parser that parses ticket IDs

package inf122.horses.console.parsers;


public class TicketIdWordParser extends RangedIntegerWordParser
{
	public TicketIdWordParser()
	{
		super(0, Integer.MAX_VALUE);
	}
}
