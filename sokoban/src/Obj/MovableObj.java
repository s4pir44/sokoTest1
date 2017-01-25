package Obj;

public class MovableObj extends SokobanObj {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2884244245663573316L;
	public MovableObj(){};

	public void moveUp(int x,int y)
	{
		 place.setLocation(place.getX(), place.getY()+1);
	}
	
	public void moveDown(int x,int y)
	{
		 place.setLocation(place.getX(), place.getY()-1);
	}
	
	public void moveLeft(int x,int y)
	{
		 place.setLocation(place.getX()-1, place.getY());
	}
	
	public void moveRight(int x,int y)
	{
		 place.setLocation(place.getX(), place.getY()+1);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

