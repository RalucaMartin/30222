package underworld.models;
import underworld.utils.Resources;

public class Map {
	private int[] resources;
	
	//constructor
	public Map(){
		resources = new int[] {1,4,8,5,7,1,6,2,9,0};
	}
	
	//methods
	public void generateResources(){
		for(int i = 0; i < resources.length ; i++){	
			resources[i] = Resources.generateValuableResource();
		}
	}
	
	public boolean consumeResource(int resource){
		boolean found = false;
		for(int i = 0; i < resources.length ; i++){
			if( resources[i] == resource){
				resources[i] = -1; 
				found = true;
			}
		}
		if (found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showResources(){
		System.out.println("[Map] Resources: ");
		for( int i=0; i < resources.length; i++){
			System.out.format( "%d ", resources[i]);
		}
	}
}
