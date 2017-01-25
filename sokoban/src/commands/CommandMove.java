package commands;

import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;

import Obj.BoxTarget;
import Obj.Space;
import cli.Game;
import level.Movement;
import cli.*;

public class CommandMove extends Command {

	@Override
	public abstract void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
		Movement move=new Movement();
		//(arg)
		move.mackeMove(params[0]);

	}
}