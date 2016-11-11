package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {
	
	private String  name;
	private static int[] backpack;
	private static int backpackIndex;
	
	public Miner (String name) {
		
		backpack = new int[50];
		for (int i = 0; i < backpack.length; i++) {
			backpack[i] = -1;
		}
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setName (String name) {
		
		this.name = name;
	}
	
public static int dig() {
		
		int newResources;
		backpackIndex++;
		if ( isBackpackFull() == false ) {
			newResources = Resources.generateResource();
			backpack[backpackIndex] = newResources;
		}
		return backpack[backpackIndex]; 			
	}
	
	public static int sleep() {
		
		int resourceValue = Resources.generateResource(); 
		return resourceValue;	
	 }
	
	public static boolean isBackpackFull() {
		if (backpackIndex == (Constants.MINER_BACKPACK_SIZE -1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showBackpack () {
		System.out.print("Backpack resources"); 
		for (int i = 0; i < backpack.length; i++) {
			System.out.print(backpack[i] + " ");
		}		
	}
	
	private int getNumberOfBackpackSlots () {
		
		int emptySlots = backpack.length - backpack[backpackIndex];
		return emptySlots;	
	}
	
}
	