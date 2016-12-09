package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {

	private String name;
	private int backpack [] = new int[Constants.MINER_BACKPACK_SIZE];
	private int backpackIndex = 0;
	
	public Miner(){
		//name = "Vasile";
		int i = 0;
		
		while(i != Constants.MINER_BACKPACK_SIZE){
			backpack[i] = -1;
			i++;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int sleep(){
		int value;
		value = Resources.generateResource();
		return value;
	}
	
	public int dig(){
		int value;
		
		boolean ok = isBackPackFull();
		if(ok == true){
			return 0;
		}
		else{
			value = Resources.generateResource();
			backpack[backpackIndex] = value;
			backpackIndex++;
			return value;
			
		}
	}
	
	boolean isBackPackFull(){
		int i = 0;
		while(i < Constants.MINER_BACKPACK_SIZE){
			i++;
			if(backpack[i] == -1)
				return false;
		}
		return true;
				
	}
	
	public void showBackPack(){
		int i = 0, value;
		
		System.out.println("Our resources from our backpack are: ");
		
		while(i < Constants.MINER_BACKPACK_SIZE){
			System.out.print(backpack[i] + "  ");
			i++;
		}	
		
		value = getNumberOfBackPackSlots();
		System.out.println("And the number of empty slots is:" + value);
	}
		
	
	public int getNumberOfBackPackSlots(){
		int i = 0, counter = 0;
		while(i < Constants.MINER_BACKPACK_SIZE){
		if(backpack[i] == -1)
			counter++;
		i++;
		}
		return counter;
		
	}

}
