package underworld.models;

import underworld.units.Resources;

public class Miner {
	private String name;
	private int[] backpack = {0, 0, 0, 0, 0};
	private int backpackIndex = 0;
	
	public Miner(String name) {
		int i;
		this.name = name;
		for(i=0;i<backpack.length;i++) {
			backpack[i] = -1;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int dig() {
		int resource = -1;
		if(!isBackpackFull()) {
			resource = Resources.generateResource();
			backpack[backpackIndex] = resource;
			backpackIndex++;
		}
		return resource;
	}
	
	public int sleep() {
		int resource;
		resource = Resources.generateResource();
		return resource;
	}
	
	private boolean isBackpackFull() {
		if(backpackIndex > 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showBackpack() {
		int i, emtySlots = 0;
		System.out.println("The resources in the backpack: ");
		for(i=0;i<5;i++) {
			System.out.println(backpack[i] + " ");
		}
		emtySlots = getNumberOfBackpackSlots();
		System.out.println("You have " + emtySlots + " slots emty.");
		
	}
	
	private int getNumberOfBackpackSlots() {
		return backpack.length - backpackIndex;
	}
}
