
package level;

import java.io.Serializable;
import java.lang.annotation.Target;

import Obj.SokobanObj;
import java.util.ArrayList;

import java.awt.Point;

import Obj.BoxTarget;
import Obj.Player;
import Obj.SokobanObj;

public class Level  implements Serializable{
	
	
    public Level(){}

    //������ ���� ��� ����� ���� ���������� ����� ���� ������
   
	private String levelName;
	
	private Player player;
	
	private ArrayList<ArrayList<SokobanObj>> board ;
	private ArrayList<BoxTarget> targets;
	
	public boolean levelComplited(){
		if (targets.isEmpty())
			return false;
		for(int i=0;i<targets.size();i++)
		{
			if(targets.get(i).getIfFull()==false)
				return false;
		}
		return true;
	}
	

	
	//swap function 
	//��� �� ���� �� ���� �� X Y
	public void swapTwoBoardObjs(Point p1, Point p2)
	{
		int p1y=(int)p1.getY();
		int p2y=(int)p2.getY();
		int p1x=(int)p1.getX();
		int p2x=(int)p1.getX();
		if(p1.getX()==p2.getX())
	    {
			int linePosition = (int)p1.getX();
			ArrayList<SokobanObj> lineWithObjsToBeSwapped = board.get(linePosition);
			SokobanObj firstObj = lineWithObjsToBeSwapped.get((int)p1.getY());
			SokobanObj secondObj = lineWithObjsToBeSwapped.get((int)p2.getY());
			
			lineWithObjsToBeSwapped.set(p1y, secondObj);
			secondObj.setLocation(linePosition, p1y);
			
			
			lineWithObjsToBeSwapped.set(p2y, firstObj);
			firstObj.setLocation(linePosition, p2y);
	    }
		else 
		{
			ArrayList<SokobanObj> line1 = board.get((int)p1.getX());
			ArrayList<SokobanObj> line2 = board.get((int)p2.getX());
			SokobanObj firstObj = line1.get((int)p1.getY());
			SokobanObj secondObj = line2.get((int)p2.getY());
			
			line1.set((int)p1.getY(), secondObj);
			secondObj.setLocation((int)p1.getX(), (int)p1.getY());
			
			line2.set((int)p2.getY(), firstObj);
			firstObj.setLocation((int)p2.getX(), (int)p2.getY());
		}
	}
	
	
	//swap function 
	//��� �� ���� �� ���� �� X Y
	public void swap (SokobanObj a, SokobanObj b){
	    SokobanObj c =a,g;
	    Point p=a.getPlace(), z=b.getPlace(),r;
	    r=a.getPlace();
	    if(p.getY()!=z.getY())//X is columns
	    {
	    	double tempX = a.getPlace().getX();
	    	double tempY = a.getPlace().getY();
	    	
	    	double tempX2 = b.getPlace().getX();
	    	double tempY2 = b.getPlace().getY();
	    	
	    	a.setPlace(new Point((int)b.getPlace().getX(),(int)b.getPlace().getY()));
	    	b.setPlace(new Point((int)tempX,(int)tempY));
	    	
	    	board.get((int)tempY).set((int)tempX, b);
	    	board.get((int)tempY2).set((int)tempX2, a);
/*	    	c=board.get((int)p.getX()).get(0);//����� �� ����� �� a
	    	this.board.get((int)p.getX()).set(0, b);//����� � 
	    	//A
	    	//���� ���� �� 
	    	//B
	    	this.board.get((int)p.getX()).get(0).setLocation((int)p.getX(),(int)p.getY());//Change the location of the obj we replaced
	    	this.board.get((int)z.getX()).set(0, c);
	    	this.board.get((int)p.getX()).get(0).setLocation((int)z.getX(),(int)z.getY());//Change the location of the obj we replaced*/
	    }
	    
	    else//if(p.getX()!=z.getX())
	    {
	    	
	    	double tempX = a.getPlace().getX();
	    	double tempY = a.getPlace().getY();
	    	
	    	double tempX2 = b.getPlace().getX();
	    	double tempY2 = b.getPlace().getY();
	    	
	    	a.setPlace(new Point((int)tempX2,(int)tempY2));
	    	b.setPlace(new Point((int)tempX,(int)tempY));
	    	
	    	this.board.get((int)tempY).set((int)tempX, b);
	    	this.board.get((int)tempY2).set((int)tempX2, a);
	    	/*
	    	c=board.get((int)p.getX()).get(0);//����� �� ����� �� a
	        g=board.get((int)z.getX()).get(0);
	    	this.board.get((int)p.getX()).set(0, b);//����� � 
	    	//A
	    	//���� ���� �� 
	    	//B
	    	this.board.get((int)p.getX()).get(0).setLocation((int)p.getX(),(int)p.getY());//Change the location of the obj we replaced
	    	this.board.get((int)z.getX()).set(0, c);
	    	this.board.get((int)p.getX()).get(0).setLocation((int)z.getX(),(int)z.getY());//Change the location of the obj we replaced
	    
	    */
	    
	    }
	}
	
	
	
	public Level (Player player, ArrayList<ArrayList<SokobanObj>> board ,ArrayList<BoxTarget> targrts){
		this.board=board;
		this.targets=targrts;
		this.player = player;
	}



	public String getLevelName() {
		return levelName;
	}



	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}



	public ArrayList<ArrayList<SokobanObj>> getBoard() {
		return board;
	}



	public void setBoard(ArrayList<ArrayList<SokobanObj>> board) {
		this.board = board;
	}



	public ArrayList<BoxTarget> getTargets() {
		return targets;
	}



	public void setTargets(ArrayList<BoxTarget> targets) {
		this.targets = targets;
	}



	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}
	

	
	
}
