package uci.inf122.assignment2HorseBetting;

import inf122.horses.console.commands.BetType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Race 
{
	private int raceID;
	private Set<String> horses;
	private HashMap<String, Horse> horsesMap;
	private boolean isPostTime;
	
	private Horse firstHorse;
	private Horse secondHorse;
	private Horse thirdHorse;
	
	private ArrayList<Ticket> winPool;
	private ArrayList<Ticket> showPool;
	private ArrayList<Ticket> placePool;
	
	public Race(int raceID, Set<String> horses)
	{
		this.raceID = raceID;
		this.horses = horses;
		horsesMap = new HashMap<String, Horse>();
		isPostTime = false;
		
		winPool = new ArrayList<Ticket>();
		showPool =  new ArrayList<Ticket>();
		placePool = new ArrayList<Ticket>();
		
		for (String next : horses)
		{
			horsesMap.put(next, new Horse(next));
		}
	}
	
	public int getRaceID()
	{
		return raceID;
	}
	
	public Horse getFirstPlace()
	{
		return firstHorse;
	}
	
	public Horse getSecondPlace()
	{
		return secondHorse;
	}
	
	public Horse getThirdPlace()
	{
		return thirdHorse;
	}
	
	public void setFirstPlace(Horse horse)
	{
		firstHorse = horse;
	}
	
	public void setSecondPlace(Horse horse)
	{
		secondHorse = horse;
	}
	
	public void setThirdPlace(Horse horse)
	{
		thirdHorse = horse;
	}
	
	public Set<String> getHorses()
	{
		return horses;
	}
	
	public boolean getPostTime()
	{
		return isPostTime;
	}
	
	public void setPostTimeOn(boolean post)
	{
		isPostTime = post;
	}
	
	public boolean doesHorseExist(String horseID)
	{
		if (horsesMap.containsKey(horseID))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Horse getHorse(String horseID)
	{
		return horsesMap.get(horseID);
	}

	public void placeTicketInPool(Ticket ticket)
	{
		if (ticket.getBetType().equals(BetType.WIN))
		{
			winPool.add(ticket);
		}
		else if (ticket.getBetType().equals(BetType.SHOW))
		{
			showPool.add(ticket);
		}
		else if (ticket.getBetType().equals(BetType.PLACE))
		{
			placePool.add(ticket);
		}
		else
		{
			System.err.print("ticket not associated with any pool type");
		}
	}
}
