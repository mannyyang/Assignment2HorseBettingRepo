// ConsoleCommandOutputStream.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Writes command output to the console (i.e., System.out)

package inf122.horses.console.io;


class ConsoleCommandOutputStream implements CommandOutputStream
{
	public void writeOutput(String outputLine)
	{
		System.out.println(outputLine);
	}
}
