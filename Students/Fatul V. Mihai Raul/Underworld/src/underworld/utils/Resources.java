package underworld.utils;

import java.util.Random;

public class Resources {
	private static  Random random = new Random();
	
	public static int generateValuableResource(){
		int min = 0,
			max= Constants.MAP_RESOURCES_NUMBER;
		int Result = random.nextInt(max - min) + min;
			return Result;
	}
	
	public static int generateResource(){
		int min = 0,
			max = Constants.MAP_RESOURCES_NUMBER*2;
		int Result = random.nextInt(max - min) + min;
		return Result;
	}
}
