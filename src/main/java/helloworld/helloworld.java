package helloworld;
import java.util.logging.Logger;
import java.util.logging.Level;
public class helloworld {
	public static void main(String[] args) {
	    
		 Logger logger = Logger.getLogger(helloworld.class.getName());
		 logger.log(Level.INFO, "HELLO WORLD!");

	}
}