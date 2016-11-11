package underworld.models;

import underworld.utils.Resources;

public class Miner {
	
	private String name; 
	private int[] backpack;
	private int backpackIndex; //is a variable in which we will store the current position in which we
	//will be able to place some resource inside our miner's backpack array.
	
	public Miner(String name) {
		this.name = name;
		backpack = new int[5];
		this.backpackIndex = 0;
		for ( int i = 0; i <= 4; i++) {
			backpack[i] = -1;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int dig() {
		int resource;
        if ( backpackIndex < 4 && ( backpack[backpackIndex] == -1 )) { //if we are not at the end of the array and we have not put any resource yet
            resource = Resources.generateResource();
            backpack[backpackIndex] = resource;
            backpackIndex++;
            return resource;
        }
        else {
            return 0;
        }
	}	

	
	public int sleep() {
		int resource = Resources.generateResource();
		return resource;
	}
	
	private Boolean isBackpackFull() {
		if ( backpackIndex >= 4) {
			return true;
		}
		return false;
	}
	
	public void showBackpack() {
		System.out.println( "The resources stored inside the backpack are: ");
		for( int i = 0; i <= 4; i++) {
			System.out.print(" " + backpack[i]);
		}	
		System.out.println( " The number of emty slots is: " + getNumberOfBackpackSlots());
	}
	
	private int getNumberOfBackpackSlots(){
		int emptyBackpackSlots = 0;
		for( int i = 0; i <= 4; i++) {
			if( backpack[i] == -1){
				emptyBackpackSlots += 1;
			}
		}
		return emptyBackpackSlots;		
	}
}
