// WelcomeCommandResult.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Represents the result of a WELCOME command

package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;


public class WelcomeCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("Informatics 122 Winter 2013 - Project #2 - READY");
	}
	
	
	public boolean stopConsole()
	{
		return false;
	}
}
