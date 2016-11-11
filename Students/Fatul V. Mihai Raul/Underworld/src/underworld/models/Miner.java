package underworld.models;
import underworld.utils.*;

public class Miner {
	private String name;
	private int backpack[] = {-1,-1,-1,-1,-1};
	private int backpackIndex;
	
	public Miner(String name){
		this.name = name;
		backpackIndex -=1;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int dig(){
		if(isBackpackFull()== false){
			backpackIndex++;
			backpack[backpackIndex]=Resources.generateResource();
			
		}
		return backpack[backpackIndex];
	}
	
	public int sleep(){
		return Resources.generateResource();
	}
	
	private boolean isBackpackFull(){
		for(int i = 0;i< backpack.length; i++){
			if(backpack[i]==-1)
				return false;
		}
		return true;
	}
	
	public void showBackpack(){
		for (int i = 0; i < backpack.length; i++){
			System.out.println(backpack[i]);
		}
		int emptySlots = getNumberOfBackpackSlots();
		System.out.println(emptySlots);
	}
	
	private int getNumberOfBackpackSlots(){
		return backpack.length-backpackIndex;
	}
}
