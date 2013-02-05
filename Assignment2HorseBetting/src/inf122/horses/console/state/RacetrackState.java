// RacetrackState.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// A RacetrackState represents an object that holds all of the state necessary
// to run the console-mode user interface.

package inf122.horses.console.state;

import inf122.horses.console.commands.BetType;
import uci.inf122.assignment2HorseBetting.Race;
import uci.inf122.assignment2HorseBetting.Racetrack;
import uci.inf122.assignment2HorseBetting.Ticket;


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
		return rt.getRace(raceID);
	}
	
	public void setTakeAmount(double takeAmount)
	{
		rt.setTakeAmount(takeAmount);
	}
	
	public double getTakeAmount()
	{
		return rt.getTakeAmount();
	}
	
	public void setPostTimeOn(int raceID, boolean post)
	{
		rt.getRace(raceID).setPostTimeOn(post);
	}
	
	public boolean getPostTime(int raceID)
	{
		return rt.getRace(raceID).getPostTime();
	}
	
	public boolean doesRaceExist(int raceID)
	{
		return rt.doesRaceExist(raceID);
	}
	
	public Ticket getTicket(int ticketID)
	{
		return rt.getTicket(ticketID);
	}
	
	public void placeBet(Race race, String horseNumber, BetType betType, int betAmount)
	{
		rt.placeBet(race, horseNumber, betType, betAmount);
	}
	
	public void cancelBet(int ticketID)
	{
		rt.cancelBet(ticketID);
	}
}
