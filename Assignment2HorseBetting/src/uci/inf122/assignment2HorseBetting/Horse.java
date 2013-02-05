package uci.inf122.assignment2HorseBetting;

import inf122.horses.console.commands.BetType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Horse 
{
	private String horseNumber;
	private HashMap<Integer, Ticket> tickets;
	
	public Horse(String horseNumber)
	{
		tickets = new HashMap<Integer, Ticket>();
		this.horseNumber = horseNumber;
	}
	
	public String getHorseNumber()
	{
		return horseNumber;
	}
	
	public void addTicket(int ticketID, Ticket ticket)
	{
		tickets.put(ticketID, ticket);
	}
	
	public int getTotalAmount(BetType betType)
	{
		int totalAmt = 0;
		
		Iterator<Entry<Integer, Ticket>> it = tickets.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, Ticket> pairs = it.next();
			if(pairs.getValue().getBetType().equals(betType))
			{
				totalAmt += pairs.getValue().getBetAmount();
			}
		}
		
		return totalAmt;
	}

}
