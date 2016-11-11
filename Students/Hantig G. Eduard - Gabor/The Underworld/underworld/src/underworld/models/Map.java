package underworld.models;

import underworld.utils.Resources;
public class Map {
	private int[] resources = {9,4,0,8,7,4,5,8,1,3};
	
	public Map() {
		
	}
	
	public void generateResources() {
		for (int index = 0; index < resources.length; index++) {
			resources[index] = Resources.generateValuableResource();
		}
	}
	
	public boolean consumeResource(int resource) {
		boolean found = true;
		for(int index = 0; index < resources.length; index++) {
			if (resources[index] == resource) {
				resources[index] = -1;
				return found;
			}
		}
			return !found;
	}
	
	public void showResources() {
		System.out.print("[Map] Resources:");
		for (int index = 0; index < resources.length; index++) {
			System.out.print(" " + resources[index]);
		}
		System.out.println();
	}
	

}
