// ConsoleCommandStreamsFactory.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Isolates the decision about how to create console-based command streams.

package inf122.horses.console.io;


public class ConsoleCommandStreamsFactory implements CommandStreamsFactory
{
	public CommandInputStream createCommandInputStream()
	{
		return new ConsoleCommandInputStream();
	}
	
	
	public CommandOutputStream createCommandOutputStream()
	{
		return new ConsoleCommandOutputStream();
	}
}
