package underworld.models;
import underworld.utils.*;

public class Map {
	private int resources[] = {0,0,0,0,0,0,0,0,0,0};
	
	public Map(){
		resources = new int[]{1,2,3,4,5,6,7,8,9,10};
	}
	public void generateResources(){
		for (int i =0; i< resources.length; i++){
			resources[i] = Resources.generateValuableResource();
		}
		
	}
	
	public boolean consumeResource(int resource){
		boolean ok = false;
		for(int i = 0; i < resources.length; i++){
			if(resources[i] == resource){
				resources[i]=-1;
				ok=true;
			}
		}
		if(ok){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void showResources(){
		for(int i = 0; i < resources.length; i++){
			System.out.print(resources[i]+" ");
		}
	}
}
