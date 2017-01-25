package commands;

import level.Level;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import cli.*;

import level.Level;
import level.LoadFactory;
import level.LevelLoader;

public class CommandLoadFileName extends Command {

	@Override
	public abstract void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		LoadFactory loadFactory = new LoadFactory();
		//(arg)
		LevelLoader loader = loadFactory.createLoader(params[0]);
		//(arg)
		InputStream file = new FileInputStream(psrsms[0]);
		Level level = loader.load(file);
		
		//TODO: Store Inside Game singleton
		Game game = Game.getInstance();
		game.setLevel(level);
		
	}

	/*@Override
	public  execute(String arg) throws FileNotFoundException, IOException, ClassNotFoundException {
//		LoadFactory fac=new LoadFactory();
//		InputStream file=new FileInputStream(args[1]);
//		return(fac.createLoader(args[1]).LevelLoader(file));
	
		LoadFactory fac=new LoadFactory();
		LevelLoder loadFac=new LevelLoader();
		loadFac=fac.createLoader(String args[0]);
	}
*/
	

	}
	

