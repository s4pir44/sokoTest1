package level;


import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

import Obj.SokobanObj;
import Obj.Space;
import Obj.Box;
import Obj.Player;
import Obj.BoxTarget;
import Obj.Wall;


import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

import Obj.SokobanObj;
import Obj.Space;
import Obj.Box;
import Obj.Player;
import Obj.BoxTarget;
import Obj.Wall;

public class MyTextLevelLoader implements LevelLoader {

	@Override
	public Level load(InputStream in) throws IOException, ClassNotFoundException {
		Level level;
		
		
		ArrayList<ArrayList<SokobanObj>> board = new ArrayList<>();
		board.add(new ArrayList<SokobanObj>());
		ArrayList<BoxTarget> targets = new ArrayList<>();
		//הוספתי גם הכנסת מידע לשחקן
		//botTarget קבוע
		Player player = null;
		BoxTarget  boxTarget;
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(in));
		
		//this char in the text 
	    char ch;
	    //the checker
	    int c;
	    //the index of the Piont(x,y)
	    int x=0,y=0;
	    
	    while ((c=in.read()) !=-1) {
	    	ch=(char)c;
			switch(ch)
			{
			case '#':
				board.get(x).add(y, new Wall(new Point(x,y)));
				y++;
				break;
			case '@':
				board.get(x).add(y, new Box(new Point(x,y)));
				y++;
				break;
			case '\n':
				y=0;
				x++;
				board.add(new ArrayList<SokobanObj>());
				break;
			case '!':
				player = new Player(new Point(x, y));
				board.get(x).add(player);
				
				y++;
				break;
			case ' ':
				board.get(x).add(y, new Space(new Point(x, y)));
				y++;
				break;
			case 'o':
				boxTarget = new BoxTarget(new Point(x, y));
				
				board.get(x).add(y, boxTarget);
				targets.add(boxTarget);
				y++;
				break;
				
		
			}
			
				
			}
	 
		return (new Level(player, board,targets));
			
		}


		
}