// ConsoleCommandInputStream.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Reads commands from the console (i.e., System.in)

package inf122.horses.console.io;

import java.util.Scanner;


class ConsoleCommandInputStream implements CommandInputStream
{
	public ConsoleCommandInputStream()
	{
		consoleIn = new Scanner(System.in);
		firstCommandReturned = false;
	}
	
	
	public String nextCommandString()
	{
		if (!firstCommandReturned)
		{
			firstCommandReturned = true;
			return "WELCOME";
		}
		else
		{
			return consoleIn.nextLine();
		}
	}
	
	
	private Scanner consoleIn;
	private boolean firstCommandReturned;
}
