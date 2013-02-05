package inf122.horses.console.results;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ShowBetPlacedCommandResult implements CommandResult
{
	private int raceID;
	private Set<String> horses;
	private int betAmount;
	
	public ShowBetPlacedCommandResult(int raceID, Set<String> horses, int betAmount)
	{
		this.raceID = raceID;
		this.horses = horses;
		this.betAmount = betAmount;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		Iterator<String> it = horses.iterator();
		String s = "Race #" + raceID +  ": A Show bet for $" + betAmount + " placed on horses [" + it.next();
		while(it.hasNext())
		{
			s = s + ", " + it.next();
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
