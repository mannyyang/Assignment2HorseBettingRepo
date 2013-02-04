package uci.inf122.assignment2HorseBetting;

import java.util.HashMap;
import java.util.Set;

public class Racetrack 
{
	private HashMap<Integer, Race> tracks;
	private double takeAmount = 0.00;

	public Racetrack()
	{
		tracks = new HashMap<Integer, Race>();
	}
	
	public HashMap<Integer, Race> getRaces()
	{
		return tracks;
	}
	
	public void addRace(int raceID, Set<String> horses)
	{
		Race race = new Race(raceID, horses);
		tracks.put(raceID, race);
	}
	
	public void setTakeAmount(double takeAmount)
	{
		this.takeAmount = takeAmount;
	}
	
	public double getTakeAmount()
	{
		return takeAmount;
	}
}
