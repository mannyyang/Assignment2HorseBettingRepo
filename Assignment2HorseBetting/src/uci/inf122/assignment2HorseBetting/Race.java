package uci.inf122.assignment2HorseBetting;

import java.util.Set;

public class Race 
{
	private int raceID;
	private Set<String> horses;
	
	public Race(int raceID, Set<String> horses)
	{
		this.raceID = raceID;
		this.horses = horses;
	}
	
	public int getRaceID()
	{
		return raceID;
	}
	
	public Set<String> getHorses()
	{
		return horses;
	}

}
