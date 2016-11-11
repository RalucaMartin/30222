package underworld.utils;

import java.util.Random;


public class Resources {

	public static Random random = new Random();
	
	public static int generateValuableResource(){
		int randomResource = random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
		
		return randomResource;
	}

public static int generateResource(){
	int randomResource = random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 + 1);
	
	return randomResource;
	}


}
