package Underworld.models;
import Underworld.utils.*; 
public class Map {
	int[] resources;
	public Map(){
		resources = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	}
	public void generateResources(){
		int i;
		for(i = 0; i< resources.length; i++){
			Resources.generateValuableResource();
		}
	}
	public boolean consumeResource(int resource){
	int i;
	for(i = 0; i < resources.length; i++){
		if(resources[i] == resource){
			resources[i] = -1;
			return true;
		}
	}
	return false;
	}
	public void showResources(){
		int i;
		for (i = 0; i < resources.length; i++){
			System.out.println(resources[i]);
		}
	}

}
