// CommandStreamsFactory.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Hides the decision about how to create new command streams.

package inf122.horses.console.io;


public interface CommandStreamsFactory
{
	CommandInputStream createCommandInputStream();
	CommandOutputStream createCommandOutputStream();
}
