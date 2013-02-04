package inf122.horses.console.results;

import inf122.horses.console.state.RacetrackState;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import uci.inf122.assignment2HorseBetting.Race;

public class RaceCommandResult implements CommandResult
{
	private int raceID;
	private Set<String> horses;
	private Race race;

	public RaceCommandResult(int raceID, RacetrackState rts)
	{
		race = rts.getRace(raceID);
		this.raceID = race.getRaceID();
		this.horses = race.getHorses();
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		Iterator<String> hIt = horses.iterator();
		
		String s = "Race ID#: [" + raceID + "] added with horses [" + hIt.next();
		while (hIt.hasNext())
		{
			s = s + ", " + hIt.next();
		}
		s += "]";
		
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}

}
