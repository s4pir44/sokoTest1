package commands;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import cli.*;

import level.LevelSaver;
import level.SaveFactory;

public class CommandSave extends Command {
	


	@Override
	public abstract void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
//		SaveFactory fac=new SaveFactory();
//		OutputStream file=new FileOutputStream(args[1]);
//		Level(fac.createSaver(args[1]).saveLevel(theLavel.getLevel(),file );
//		level.setLevelName(args[1]);
		
		// TODO Auto-generated method stub
				SaveFactory saveFactory = new SaveFactory();
				//(arg)
				LevelSaver saver = saveFactory.createSaver(params[0]);
				//(arg)
				OutputStream file = new FileOutputStream(params[0]);
				saver.save(Game.getInstance().getLevel(), file);
				
			
				
	}
	

}
