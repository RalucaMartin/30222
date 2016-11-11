package Underworld.utils;

import java.util.Random;

public class Resources {
private static Random random = new Random();
public static int generateValuableResource(){
	
	int rand = random.nextInt(Constants.MAP_RESOURCES_NUMBER);
	return rand;
	
}
public static int generateResource(){
	
	int rand = random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2);
	return rand;
	
}
}
