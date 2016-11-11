package underworld.models;

import underworld.utils.Resources;

public class Map {
	private int[] resources;
	public Map() {
		resources = new int[] {43,21,54,32,98,56,67,73,85,41}; 
	}
	
	public void generateResources() {
		int i;
		for(i = 0; i < 10; i++) {
			resources[i] = Resources.generateValuableResources();
		}
	}
	
	public boolean consumeResources(int resource) {
		int i;
		int Found = 0;
		for(i = 0; i < 10; i++) {
			if(resource == resources[i]) {
				resources[i] = -1;
				Found = 1;
			}
		}
		if(Found == 1)
			return true;
		return false;
	}
	
	public void showResources() {
		int i;
		for(i = 0; i < 10; i++) {
			System.out.println(resources[i]);
		}
	}
}
