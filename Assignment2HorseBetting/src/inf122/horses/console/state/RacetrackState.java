// RacetrackState.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// A RacetrackState represents an object that holds all of the state necessary
// to run the console-mode user interface.

package inf122.horses.console.state;
import java.util.Set;

import uci.inf122.assignment2HorseBetting.Race;
import uci.inf122.assignment2HorseBetting.Racetrack;


public class RacetrackState
{
	// Inf122TBD: This needs to be filled in with whatever parts of your
	// engine you will require in order to track the overall state of the
	// racetrack from one command to the next
	private Racetrack rt;
	
	public RacetrackState()
	{
		rt = new Racetrack();
	}
	
	public void addRace(Race race)
	{
		rt.addRace(race);
	}
	
	public Race getRace(int raceID)
	{
		return rt.getRaces().get(raceID);
	}
	
//	public void addRace(int raceID, Set<String> horses)
//	{
//		rt.addRace(raceID, horses);
//	}
	
	public void setTakeAmount(double takeAmount)
	{
		rt.setTakeAmount(takeAmount);
	}
	
	public double getTakeAmount()
	{
		return rt.getTakeAmount();
	}
}
