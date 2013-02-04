package uci.inf122.assignment2HorseBetting;

import java.util.HashMap;

public class Racetrack 
{
	private HashMap<Integer, Race> races;
	private double takeAmount = 0.00;

	public Racetrack()
	{
		races = new HashMap<Integer, Race>();
	}

	public HashMap<Integer, Race> getRaces()
	{
		return races;
	}

	public void addRace(Race race)
	{
		races.put(race.getRaceID(), race);
	}

	public Race getRace(int raceID)
	{
		return races.get(raceID); 
	}
	
	public boolean doesRaceExist(int raceID)
	{
		if (races.containsKey(raceID))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void setTakeAmount(double takeAmount)
	{
		this.takeAmount = takeAmount/100;
	}

	public double getTakeAmount()
	{
		return takeAmount;
	}
}
