package inf122.horses.console.results;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RaceCommandResult implements CommandResult
{
	private int raceID;
	private Set<String> horses;

	public RaceCommandResult(int raceID, Set<String> horses)
	{
		this.raceID = raceID;
		this.horses = horses;
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
