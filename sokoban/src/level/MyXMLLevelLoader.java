package level;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyXMLLevelLoader implements LevelLoader  {
	@Override
	public Level load(InputStream load) throws IOException, ClassNotFoundException {
		
		XMLDecoder d=new XMLDecoder(load);
		Level lvl=(Level) d.readObject();
		d.close();
		return lvl;
	}

	




}
