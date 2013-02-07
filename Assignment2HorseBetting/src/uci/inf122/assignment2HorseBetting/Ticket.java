package uci.inf122.assignment2HorseBetting;

import inf122.horses.console.commands.BetType;

public class Ticket 
{
	private int ticketID;
	private String horseNumber;
	private Race race;
	private int betAmount;
	private BetType betType;
	private boolean claimed;
	
	public Ticket(int ticketID, Race race, String horseNumber, BetType betType, int betAmount)
	{
		this.betType = betType;
		this.ticketID = ticketID;
		this.race = race;
		this.betAmount = betAmount;
		this.horseNumber = horseNumber;
		claimed = false;
	}
	
	public int getTicketID()
	{
		return ticketID;
	}
	
	public int getBetAmount()
	{
		return betAmount;
	}
	
	public String getHorseNumber()
	{
		return horseNumber;
	}
	
	public BetType getBetType()
	{
		return betType;
	}
	
	public Race getRace()
	{
		return race;
	}
	
	public boolean isClaimed()
	{
		return claimed;
	}
	
	public void setClaimed(boolean claimed)
	{
		this.claimed = claimed;
	}
	
}
