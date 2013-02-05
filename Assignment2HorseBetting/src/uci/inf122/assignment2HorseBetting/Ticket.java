package uci.inf122.assignment2HorseBetting;

import inf122.horses.console.commands.BetType;

public class Ticket 
{
	private int ticketID;
	private String horseNumber;
	private Race race;
	private int betAmount;
	private BetType betType;
	
	public Ticket(int ticketID, Race race, String horseNumber, BetType betType, int betAmount)
	{
		this.betType = betType;
		this.ticketID = ticketID;
		this.race = race;
		this.betAmount = betAmount;
		this.horseNumber = horseNumber;
	}
	
	public int getTicketID()
	{
		return ticketID;
	}
	
	public int getBetAmount()
	{
		return betAmount;
	}
	
	public BetType getBetType()
	{
		return betType;
	}
	
	public Race getRace()
	{
		return race;
	}
	
	
}
