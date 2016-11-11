package underworld.models;

import underworld.units.Resources;

public class Map {
	private int[] resources = {1,2,0,4, -1, -1, 9, 0, 4, 7};
	
	public Map() {
	}
	
	public void generateResources() {
		Resources.generateResource();
	}
	
	public boolean consumeResource(int resource) {
		int ok = 0;
		int i;
		for(i=0;i<resources.length;i++) {
			if(resource == resources[i]) {
				ok = 1;
				resources[i] = -1;
			}
			if(ok == 1) {
				break;
			}
		}
		if(ok == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showResources() {
		int i, nrResources = 0;
		for(i=0;i<resources.length;i++) {
			if(resources[i] != -1) {
				nrResources++;
			}
		}
		if(nrResources != 0) {
			System.out.println("The available resources are: ");
			for(i=0;i<resources.length;i++) {
				if(resources[i] != -1) {
					System.out.println(resources[i] + " ");					
				}
			}
		}
		else {
			System.out.println("There are no more resources available");
		}
	}
}
