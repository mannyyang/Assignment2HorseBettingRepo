package uci.inf122.assignment2HorseBetting;

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
	
	public Race(int raceID, Set<String> horses)
	{
		this.raceID = raceID;
		this.horses = horses;
		horsesMap = new HashMap<String, Horse>();
		isPostTime = false;
		
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
	
	public void setPostTimeOn()
	{
		isPostTime = true;
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

}
