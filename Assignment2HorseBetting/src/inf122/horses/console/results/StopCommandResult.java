// StopCommandResult.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Represents the result of a STOP command

package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;


public class StopCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("Goodbye");
	}
	
	
	public boolean stopConsole()
	{
		return true;
	}
}
