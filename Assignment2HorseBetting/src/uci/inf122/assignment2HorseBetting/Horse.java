package uci.inf122.assignment2HorseBetting;

import java.util.HashMap;

public class Horse 
{
	private String horseNumber;
	private double totalAmtBetHorse;
	private HashMap<Integer, Ticket> tickets;
	
	public Horse(String horseNumber)
	{
		this.horseNumber = horseNumber;
	}
	
	public String getHorseNumber()
	{
		return horseNumber;
	}

}
