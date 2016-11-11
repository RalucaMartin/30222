package underworld.models;
import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	
	private int resources[]=new int[Constants.MAP_RESOURCES_NUMBER];
	
	public Map(){
	}
	
	public void generateResources(){
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++ ){
			resources[i] = Resources.generateValuableResources();
		}
	}
	
	public boolean consumeResource(int resource){
		
		boolean count=false;
		for(int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++){
			if(resources[i] == resource){
				resources[i] = -1;
				count = true;
			}
		}	
			return count;	
	}
	
	public void showResources(){
		
		System.out.println("Resources: ");
		for(int i = 0; i< Constants.MAP_RESOURCES_NUMBER; i++)
			System.out.print(" "+resources[i]);
	}
}
