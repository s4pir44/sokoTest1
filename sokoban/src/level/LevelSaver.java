package level;

import java.io.IOException;
import java.io.OutputStream;

public interface LevelSaver {

	
	
	public void save(Level saveMe, OutputStream out) throws IOException;

	
}
