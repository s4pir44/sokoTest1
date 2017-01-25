package commands;

import java.io.FileNotFoundException;
import java.io.IOException;

import cli.Game;
import cli.Receiver;
import level.DisplayLevel;
import level.IDisplay;
import level.Level;

public class CommandDisplay extends Command{
	
	@Override
	public abstract void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
	 IDisplay disp=new DisplayLevel();
	 disp.display(Game.getInstance().getLevel());
		
			
	
	}
}
