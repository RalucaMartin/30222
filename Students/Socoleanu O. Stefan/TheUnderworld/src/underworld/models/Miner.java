package underworld.models;

import underworld.utils.*;

public class Miner {
	private String name;
	private int backpack[] = new int[Constants.MINER_BACKPACK_SIZE];
	private int backpackIndex;
	
	public Miner(String name) {
		setName(name);
		for(int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++) {
			backpack[i]=-1;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int sleep() {
		return Resources.generateResources();
	}
	public int dig() {
		if(isBackpackFull() == false) {
			backpack[backpackIndex] = Resources.generateResources();
			return backpack[backpackIndex];
		}
		else {
			System.out.println("The backpack is full");
			return backpackIndex;
		}
	}
	private boolean isBackpackFull() {
		if(backpackIndex == Constants.MINER_BACKPACK_SIZE) {
			return true;
		}
		else {
			return false;
		}
	}
	public void showBackpack() {
		for(int i = 0; i < Constants.MINER_BACKPACK_SIZE-getNumberOfBackpackSlots(); i++) {
			System.out.print(" " + backpack[i]);
		}
		System.out.println("The backpack has " + getNumberOfBackpackSlots() + " empty slots");
	}
	private int getNumberOfBackpackSlots() {
		return Constants.MINER_BACKPACK_SIZE-backpackIndex;
	}
	
}
