package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	public int resources[] = new int[Constants.MAP_RESOURCES_NUMBER];
	
	public Map() {
	}
	public void generateResources() {
		for(int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			resources[i]=Resources.generateValuableResources();
		}
	}
	public boolean consumeResource(int resource) {
		boolean condition = false;
		for(int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			if(resources[i]==resource) {
				resources[i]=-1;
				condition = true;;
			}
		}
		return condition;
	}
	public void showResources() {
		for(int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			System.out.print(" " + resources[i]);
		}
	}
}
