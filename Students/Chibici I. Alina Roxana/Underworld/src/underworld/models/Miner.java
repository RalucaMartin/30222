package underworld.models;
import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex;
	
	//Constructor
	public Miner (String name){
		this.name = name;
		backpack = new int[] {-1,-1,-1,-1,-1};
		backpackIndex = 0;
	}
	
	//methods
	//getter and setter that are never used
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int dig(){
		if(isBackpackFull() == false){
			int resource = Resources.generateResource();
			backpack [backpackIndex] = resource;
			backpackIndex ++;
			System.out.println("[Miner] I have found " + resource);
			showBackpack();
			return resource;
		}
		else {
			System.out.println("[Miner] Backpack is full");
			return -1;
		}
	}
	
	public int sleep(){
		int decayed =  Resources.generateResource();
		System.out.println("[Miner]" + decayed + " decayed during my sleep..");
		return decayed;	
	}
	
	private boolean isBackpackFull(){
		if (backpackIndex == backpack.length){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showBackpack(){
		System.out.println( "[Miner] My backpack: ");
		for( int i=0; i < backpack.length; i++){
			System.out.format( "%d ", backpack[i]);
		}
		System.out.println(" (" + getNumberOfBackpackSlots() + ") backpack slots left!");
	}
	
	private int getNumberOfBackpackSlots(){
		return backpack.length - backpackIndex;
	}
}