package level;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

import Obj.Box;
import Obj.BoxTarget;
import Obj.Player;
import Obj.SokobanObj;
import Obj.Space;
import Obj.Wall;

public class MyTextLevelSaver implements LevelSaver {

	
	public void save(Level saveMe, OutputStream out) throws IOException {
	
		
	
		
		//this char in the text 
	    char ch;
	    //the obj
	    String obj;
	    //the index of the Piont(x,y)
	    int x=0,y=0;
	    
	    for(int i=0;i<saveMe.getBoard().size();i++)
	    {	for(int j=0;j<saveMe.getBoard().get(i).size();j++)
	  	{
	        obj= saveMe.getBoard().get(i).get(j).getName();
			switch(obj)
			{
			case "wall":
		        out.write('#');
				break;
			case "box":
				 
				break;

			case "player":
			
				break;
			case "space":
			
				break;
			case "boxTarget":
				
				break;
				
			}
			//לרדת שורה 
			}
	  	}
				
			}
	
			


	}
