package commands;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.SingleSelectionModel;

import cli.Cli;
import level.Level;

public class CommandExit extends Command {
	private Cli myCli;
	
	public CommandExit(Cli cli)
	{
		myCli = cli;
	}
	
	@Override
	public abstract void execute() throws FileNotFoundException, IOException, ClassNotFoundException {

					myCli.setIsRunning(false);
			
			

		}

		
	}

	

