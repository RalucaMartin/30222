package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	
	private static int[] resources = { 12, 8, 11, 1, 43 };
	
	public Map() {
		
		int[] resources = new int[5];
	}
	
	public static void generateResources() {
		
		for ( int i = 0; i < resources.length; i++) {
			resources[i] = Resources.generateValuableResource();
			
		}
	}
		
	public static boolean consumeResources(int resource) {
		
		boolean found = false;
		for (int i = 0; i < resources.length; i++) {
			if (resource == resources[i]) {
				resources[i] = -1;
				found = true;
				}
			else {
				found = false;
				}
			}
			if (found == true) {
				return found;
				}
			else {
				return false;
			}		
	}
	public static void showResources() {
		System.out.println("Resources:");
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			System.out.print(resources[i] + " ");
		}
	}
	

}
	