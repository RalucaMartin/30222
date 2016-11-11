package underworld.models;

import java.util.Arrays;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map { 
	private int[] resources;
	
	public Map() {
		resources = new int[Constants.MAP_RESOURCES_NUMBER];
		//defaul values
		for( int i = 0; i < resources.length; i++) {
			resources[i] = 0;
		}
	}
	
	//update the values in the resources array 
	public void generateResources() {
		for( int i = 0; i < resources.length; i++ ) {
			resources[i] = Resources.generateValuableResource();
		}	
	}
	
	public boolean consumeResource( int resource ) {
		int i;
		
		for( i = 0; i < resources.length; i++ ) {
			if ( resources[i] == resource ) {
				break;
			}
		}
		
		if ( i == resources.length ) {
			//it means that all items in the array were checked
			return false;
		} else {
			resources[i] = -1; //update 
			return true;
		}
	}
	
	public void showResources() {
		System.out.println( "[MAP] Resources: " +Arrays.toString(resources) );
	}
}
