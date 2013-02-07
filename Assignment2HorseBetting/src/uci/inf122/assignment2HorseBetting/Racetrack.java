package uci.inf122.assignment2HorseBetting;

import inf122.horses.console.commands.BetType;

import java.util.HashMap;

public class Racetrack 
{
	private HashMap<Integer, Race> races;
	private HashMap<Integer, Ticket> tickets;
	private int takeAmount = 0;
	private int ticketNumber = 1;

	public Racetrack()
	{
		tickets = new HashMap<Integer, Ticket>();
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

	public void setTakeAmount(int takeAmount)
	{
		this.takeAmount = takeAmount;
	}

	public int getTakeAmount()
	{
		return takeAmount;
	}
	
	public int placeBet(Race race, String horseNumber, BetType betType, int betAmount)
	{
		Ticket ticket = new Ticket(ticketNumber, race, horseNumber, betType, betAmount);
		tickets.put(ticketNumber, ticket);
		race.getHorse(horseNumber).addTicket(ticketNumber, ticket);
		race.placeTicketInPool(ticket);
		ticketNumber++;
		
		return ticket.getTicketID();
	}
	
	public void cancelBet(int ticketID)
	{
		Ticket ticket = tickets.get(ticketID);
		Race race = ticket.getRace();
		race.getHorse(ticket.getHorseNumber()).removeTicket(ticketID);
		race.removeTicketInPool(ticket);
		tickets.remove(ticketID);
	}
	
	public boolean doesTicketExist(int ticketID)
	{
		return tickets.containsKey(ticketID);
	}
	
	public Ticket getTicket(int ticketID)
	{
		return tickets.get(ticketID);
	}
}
