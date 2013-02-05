package inf122.horses.console.results;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WinBetPlacedCommandResult implements CommandResult
{
	private int raceID;
	private Set<String> horses;
	private int betAmount;
	
	public WinBetPlacedCommandResult(int raceID, Set<String> horses, int betAmount)
	{
		this.raceID = raceID;
		this.horses = horses;
		this.betAmount = betAmount;
	}
	
	@Override
	public List<String> getConsoleOutput() 
	{
		Iterator it = horses.iterator();
		String s = "Race #" + raceID +  ": A Win bet for $" + betAmount + " placed on horses [" + it.next();
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
