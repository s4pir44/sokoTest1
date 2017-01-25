package cli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import level.Level;
import level.SaveFactory.Creator;
import commands.*;

public class Cli  {

	HashMap<String, Command> commandMap;
	boolean runORexit=true;
	
	public Cli()
	{
		commandMap = new HashMap<>();
		initializeHashMap();
	}
	
	public void initializeHashMap() {
		commandMap.put("load", new CommandLoadFileName());
		commandMap.put("save", new CommandSave());
		commandMap.put("exit", new CommandExit(this));
		commandMap.put("move", new CommandMove());
		commandMap.put("display", new CommandDisplay());
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String cmd;
		String[] commend;
		while (runORexit) {
			cmd = sc.nextLine();
			String[] commendInputString = cmd.split(" ");
			try {
				if(commendInputString != null && commendInputString.length  > 0)
				{
					Command command = commandMap.get(commendInputString[0].trim().toLowerCase());
					//סימנתי בירוק את השורה כדי שזה לא יקבל מחרוזת כי יש לנו משתנה עכשיו
				//	command.execute(commendInputString.length > 1? commendInputString[1] : "");
					command.getParams().size() >1?commendInputString[1] : "";
				} 
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void setIsRunning(boolean shouldRun)
	{
		runORexit = shouldRun;
	}
	//@Override
//	public void display(String str) {
	//	System.out.println(str);

//	}



}
