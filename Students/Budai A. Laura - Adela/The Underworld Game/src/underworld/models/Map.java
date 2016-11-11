package underworld.models;

import underworld.utils.Resources;

public class Map {
	private int[] resources = new int[10];
	
	public Map(){
	resources = new int[] {15,23,19,45,32,4,12,32,47,55};
	}
	
	public void generateResources(){
		for(int i = 0; i < 10; i++){
			resources[i] =  Resources.generateValuableResources();
		}
	}
	
	public boolean consumeResource(int resource){
		int ok = 0;
		for(int i = 0; i < 10; i++){
			if(resource == resources[i]){
				resources[i] = -1;
				ok = 1;
			}
		}
		if(ok == 1)
			return true;
		return false;
	}
	
	public void showResource(){
		for(int i = 0; i < 10; i++){
			System.out.println(resources[i]);
		}
	}
}
