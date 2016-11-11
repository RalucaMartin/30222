package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {

	private String name;
	private int backpack[]=new int[Constants.MINER_BACKPACK_SIZE];
	private int backpackIndex;
	
	public Miner(String name){
		backpackIndex = 0;
		this.name = name;
		for(int i = 0; i<Constants.MINER_BACKPACK_SIZE; i++){
			backpack[i]=-1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int dig(){
		if(isBackpackfull())
			return 0;
		else 
		{	backpack[backpackIndex]=Resources.generateValuableResources();
			return backpack[backpackIndex++];
		}
	}
	
	public int sleep(){
		return Resources.generateValuableResources();
	}
	
	private boolean isBackpackfull(){
		if(backpackIndex == Constants.MINER_BACKPACK_SIZE)
			return true;
		else
			return false;
	}
	
	public void showBackpack(){
		System.out.println("Resources: ");
		for(int i = 0; i <= backpackIndex; i++){
			System.out.println(backpack[i] + " ");
			System.out.println("/n");
		}
		System.out.println("There are "+getNumberOfBackpackSlots()+" empty slots");
	}
	
	private int getNumberOfBackpackSlots(){
		return Constants.MINER_BACKPACK_SIZE-backpackIndex;
	}
	
}
