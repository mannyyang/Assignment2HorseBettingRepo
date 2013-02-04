// UnimplementedCommandResult.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Represents the result of a command that has not yet been implemented.

package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;


public class UnimplementedCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("[Command not yet implemented]");
	}
	
	
	public boolean stopConsole()
	{
		return false;
	}
}
