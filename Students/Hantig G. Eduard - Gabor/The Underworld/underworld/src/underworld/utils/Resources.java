package underworld.utils;

import java.util.Random;

import underworld.utils.Constants;

public class Resources {
	private static Random random = new Random();
	
	public static int generateValuableResource() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
	}
	
	public static int generateResource() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 + 1);
	}	
}
