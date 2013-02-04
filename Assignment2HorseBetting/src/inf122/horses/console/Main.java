// Main.java
//
// Informatics 122 Winter 2013
// Project #2: Who's Gonna Ride Your Wild Horses? (Implementation)
//
// Provides a main() method for executing the console-mode user interface
// for exercising the engine of the racetrack management system.

package inf122.horses.console;

import inf122.horses.console.io.ConsoleCommandStreamsFactory;
import inf122.horses.console.state.EmptyRacetrackStateFactory;


public class Main
{
	public static void main(String[] args)
	{
		new RacetrackConsole(
			new EmptyRacetrackStateFactory(),
			new ConsoleCommandStreamsFactory())
			.run();
	}
}
