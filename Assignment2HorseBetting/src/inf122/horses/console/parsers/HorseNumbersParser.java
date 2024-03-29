// HorseNumbersParser.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Parser that takes a sequence of horse numbers and parses them into a
// Set<String>, failing if there are any duplicates

package inf122.horses.console.parsers;

import java.util.ArrayList;
import java.util.List;


public class HorseNumbersParser
{
	public List<String> parse(String[] horseNumberWords)
	{
		List<String> horseNumbers = new ArrayList<String>();
		
		for (String horseNumber : horseNumberWords)
		{
			if (horseNumbers.contains(horseNumber))
			{
				throw new IllegalArgumentException("Duplicate horse exception");
			}
			else
			{
				horseNumbers.add(horseNumber);
			}
		}
		
		return horseNumbers;
	}
}
