package underworld.utils;

import java.util.Random;

public class Resources {
	private static Random random = new Random();
	
	public static int generateValuableResources() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER+1);
	}
	public static int generateResources() {
		return random.nextInt(2 * Constants.MAP_RESOURCES_NUMBER + 1);
	}
}
