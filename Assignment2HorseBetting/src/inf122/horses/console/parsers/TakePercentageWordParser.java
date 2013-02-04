// TakePercentageWordParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// A word parser that parses take percentages

package inf122.horses.console.parsers;


class TakePercentageWordParser extends RangedIntegerWordParser
{
	public TakePercentageWordParser()
	{
		super(0, 100);
	}
}
