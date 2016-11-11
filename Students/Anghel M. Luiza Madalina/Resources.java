package underworld.utils;

import java.util.Random;

public class Resources {
	private static Random random = new Random();
	
	public static int generateValuableResources(){
		int Low = 0;
		int High = Constants.MAP_RESOURCES_NUMBER;
		int Result = random.nextInt(High-Low) + Low;
		return Result;
	}
	
	public static int generateResources(){
		int Low = 0;
		int High = Constants.MAP_RESOURCES_NUMBER * 2;
		int Result = random.nextInt(High-Low) + Low;
		return Result;
	}
}

