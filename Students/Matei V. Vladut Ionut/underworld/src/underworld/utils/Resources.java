package underworld.utils;

import java.util.*;

public class Resources {
 
	private static Random random = new Random();
	
	public static int generateValuableResource(){
		return random.nextInt( 1 + Constants.MAP_RESOURCES_NUMBER);
		
	}
	
	public static int generateResources(){
		return random.nextInt( 2 + 2 * Constants.MAP_RESOURCES_NUMBER);
		
	}
}
