package inf122.horses.console.results;

import inf122.horses.console.state.RacetrackState;

import java.util.Arrays;
import java.util.List;

public class TakeCommandResult implements CommandResult
{
	private int takeAmount;
	
	public TakeCommandResult(RacetrackState rts)
	{
		takeAmount = rts.getTakeAmount();
	}

	@Override
	public List<String> getConsoleOutput() 
	{
		String s = "Racetrack take amount percentage set at " + takeAmount + "%";
		return Arrays.asList(s);
	}

	@Override
	public boolean stopConsole() 
	{
		return false;
	}
}
