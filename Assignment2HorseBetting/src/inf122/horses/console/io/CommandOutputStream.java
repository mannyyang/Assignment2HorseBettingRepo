// CommandOutputStream.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// This interface hides information about where command output is sent
// (e.g., the console, a socket, etc.).

package inf122.horses.console.io;


public interface CommandOutputStream
{
	void writeOutput(String outputLine);
}
