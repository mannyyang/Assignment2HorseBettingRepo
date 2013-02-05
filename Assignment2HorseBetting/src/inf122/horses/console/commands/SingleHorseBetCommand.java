// SingleHorseBetCommand.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// An abstract class that implements common behavior for commands that
// allow the user to place a bet on a single horse.

package inf122.horses.console.commands;

import java.util.Set;


public abstract class SingleHorseBetCommand implements Command
{
	public SingleHorseBetCommand(int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		this.raceNumber = raceNumber;
		this.amountPerHorse = amountPerHorse;
		this.horseNumbers = horseNumbers;
	}
	
	
	protected int getRaceNumber()
	{
		return raceNumber;
	}
	
	
	protected int getAmountPerHorse()
	{
		return amountPerHorse;
	}
	
	
	protected Set<String> getHorseNumbers()
	{
		return horseNumbers;
	}
	
	
	private int raceNumber;
	private int amountPerHorse;
	private Set<String> horseNumbers;
}
