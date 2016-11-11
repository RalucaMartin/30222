package underworld.models;

import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack = {3,5,7,8,12};
	int backpackIndex = 0;
	
	public Miner(String name) {
		this.name = name;
		for (backpackIndex = 0; backpackIndex < backpack.length; backpackIndex++) {
			backpack[backpackIndex] = -1;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int sleep() {
		return Resources.generateResource(); 
	}
	
	public int dig() {
		if (!isBackpackFull()) {
			for (backpackIndex = 0; backpackIndex < backpack.length; backpackIndex++) {
				if (backpack[backpackIndex] == -1) {
					break;
				}
			}
			backpack[backpackIndex] = Resources.generateResource();
		}
		return backpack[backpackIndex];
	}
	
	private boolean isBackpackFull() {
		for(backpackIndex = 0; backpackIndex < backpack.length; backpackIndex++) {
			if (backpack[backpackIndex] == -1) {
				return false;
			}
		}
		return true;
	}
	
	public void showBackpack() {
		System.out.print("[Miner] My backpack:");
		for (backpackIndex= 0; backpackIndex < backpack.length; backpackIndex++) {
			System.out.print(" " + backpack[backpackIndex] + " ");
		}
		System.out.println("("+ getNumberOfBackpackSlots() + ") backpack slots left");
	}
	
	private int getNumberOfBackpackSlots() {
		int counterEmptySlots = 0;
		for (backpackIndex= 0; backpackIndex < backpack.length; backpackIndex++) {
			if (backpack[backpackIndex] == -1) {
				counterEmptySlots++;
			}
		}
		return counterEmptySlots;
	}

}
