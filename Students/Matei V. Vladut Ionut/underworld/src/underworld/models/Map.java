package underworld.models;

import java.util.Arrays;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	public static int[] resources;

	
	public  Map(){
		resources = new int[Constants.MAP_RESOURCES_NUMBER];
		for(int i = 0; i < resources.length; i++){
			resources[i] = Resources.generateValuableResource();
		}
	}
	
	public void generateResources(){
        for(int i = 0; i < resources.length; i++){
            resources[i] = Resources.generateValuableResource();
        }
    }
	
	public static boolean consumeResources(int resource){
		boolean found = false;
		for(int i = 0; i < resources.length; i++){
			if ( resources[i] == resource) {
				resources[i] = -1;
				found = true;
			}
		}
		return found;
	}
	
	public void showResources(){
		System.out.println(Arrays.toString(resources));
		}
	

}
