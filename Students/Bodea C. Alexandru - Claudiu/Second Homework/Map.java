package underworld.models;

import underworld.utils.Resources;
import underworld.utils.Constants;


public class Map {
	public int[] resources;
	
	public Map(){
		resources = new int[Constants.MAP_RESOURCES_NUMBER];
		
		for ( int i = 0; i <= 9; i++) {
			resources[i] = Resources.generateValuableResource();
			
		}
	}

	public void generateResources() {
		
		for ( int i = 0; i <= 9; i++ ) {
			resources[i] = Resources.generateValuableResource();
		}
	}

	public boolean consumeResource(int resource) {
		boolean found = false;
		
		for (int i = 0; i <=9; i++) {
			if (resource ==  resources[i]) {
				resources[i] = -1;
				
				found = true;
			}
		}
	return found;
	}
	
	
public void showResource() {
	System.out.println("The resources are:");
	for (int i = 0; i <= 9;  i++){
		
		System.out.print(" " + resources[i]);
	}
}


}



