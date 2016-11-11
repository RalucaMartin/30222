package underworld.models;

import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack = new int [5];
	private int backpackIndex;
	
	public Miner(String name) {
		this.name = name;
		backpack=new int[] {-1,-1,-1,-1,-1};
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int dig(){
		for(int i = 0; i < 5; i++) {
			if(backpack[i] != -1) {
				backpack[i] = Resources.generateResources();
			}
		}
		return Resources.generateResources();
	}
	
	public int sleep() {
		return Resources.generateResources();
	}
	
	private boolean isBackpackFull() {
		for(int i = 0; i < 5; i++)
			if (backpack[i] != -1)
				return true;
			return false;
	}
	
	public void showBackpack() {
		for(int i = 0; i < 5; i++)
			System.out.println(backpack[i]);
	}
	
	private void getNumberOfBackpackSlots() {
		int empty = 0;
		for(int i = 0; i < 5; i++) {
				if(backpack[i] == -1){
					empty++;
				}
			System.out.println(empty + "Slots are empty");
		}
	}
}
