package commands;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public  abstract class Command {
	
	protected List<String> params;
	 //бочен string arg
	public abstract void execute() throws FileNotFoundException, IOException,ClassNotFoundException;
	public List<String> getParams() {
		return params;
	}
	public void setParams(List<String> params) {
		this.params = params;
	}



	
	

}
