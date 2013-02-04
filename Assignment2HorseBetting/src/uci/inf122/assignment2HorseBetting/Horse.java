package uci.inf122.assignment2HorseBetting;

import java.util.HashMap;

public class Horse 
{
	private int horseNumber;
	private double totalAmtBetHorse;
	private HashMap<Integer, Ticket> tickets;
	
	public Horse(int horseNumber)
	{
		this.horseNumber = horseNumber;
	}

}
