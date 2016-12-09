package underworld.models;
import underworld.utils.Constants;
import underworld.utils.Resources;


public class Map {
	
	private int [] resources = new int[Constants.MAP_RESOURCES_NUMBER];
	
	public void map(){
		int i = 0;
		int k = 2;
		while(i < Constants.MAP_RESOURCES_NUMBER){			
			resources[i] = k;	//giving random values to "resources"
			i++;
			k = k + 2;
		}
	}
	
	public  void generateResources(){
		int i;
		for(i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++){
			resources[i] = Resources.generateValuableResource();
		}
	}
	
	public boolean consumeResource(int resource){
		
		int i = 0;
		while(i < Constants.MAP_RESOURCES_NUMBER){
			
			if(resource == resources[i])
				return true;	
			i++;
		}
		return false;
	}
	
	public void showResources(){
		
		int i = 0;
		
		System.out.println("Our resources are: ");
		
		
		while(i < Constants.MAP_RESOURCES_NUMBER){
			System.out.print(resources[i] + "  ");
			i++;
		}
		System.out.println();
	}
}
