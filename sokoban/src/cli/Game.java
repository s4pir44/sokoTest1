package cli;

import level.Level;

public class Game {
	// ���� ������� ������ ����


		   private static Game game = new Game( );

		   /* A private Constructor prevents any other
		    * class from instantiating.
		    */
		   
		   private Level level;
		   
		   
		   public Level getLevel() {
			return level;
		}

		public void setLevel(Level level) {
			this.level = level;
		}

		//c'tur
		   private Game() { }

		   /* Static 'instance' method */
		   public static Game getInstance( ) {
		      return game;
		   }

}
