package underworld.utils;

import java.util.Random;

public class Resources {

	private static Random random = new Random();
	
	public static int generateValuableResource () {
		int i;
		int[] randomValue;
		randomValue = new int[50];
		for(i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			randomValue[i] = (int) (Math.random() * 50);
		}
		return randomValue[i];
	}
	
	public static int generateResource(){
		int i;
		int[] randomValue;
		randomValue = new int[50];
		for(i = 0; i < (Constants.MAP_RESOURCES_NUMBER) * 2; i++) {
			randomValue[i] = (int) (Math.random() * 100);
		}
		return randomValue[i];
		
	}
}
