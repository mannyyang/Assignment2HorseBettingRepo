package uci.inf122.assignment2HorseBetting;

import java.util.HashMap;

public class Horse 
{
	private String horseNumber;
	private double totalAmtBetHorse;
	private HashMap<Integer, Ticket> tickets;
	
	public Horse(String horseNumber)
	{
		tickets = new HashMap<Integer, Ticket>();
		totalAmtBetHorse = 0.00;
		this.horseNumber = horseNumber;
	}
	
	public String getHorseNumber()
	{
		return horseNumber;
	}
	
	public void addTicket(int ticketID, Ticket ticket)
	{
		totalAmtBetHorse += ticket.getBetAmount();
		tickets.put(ticketID, ticket);
	}

}
