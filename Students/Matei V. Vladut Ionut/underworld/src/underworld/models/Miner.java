package underworld.models;

import java.util.Arrays;
import underworld.utils.*;

public class Miner {
	
	private String name;
	private int[] backpack;
	private int backpackIndex;
	
	public Miner( String name){
		this.name = name;
		backpack = new int[5];
        this.backpackIndex = 0;
        
		for(int i = 0; i < this.backpack.length; i++){
			this.backpack[i] = -1;
		}
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int dig(){
		 int resource;
		 
		 if ((this.backpackIndex < 5) && (this.backpack[this.backpackIndex] == -1)){
			 resource = Resources.generateResources();
			 this.backpack[this.backpackIndex] = resource;
			 this.backpackIndex++;
			 return resource;
			 }
		 else{
			 return -1;
		 }
	}
	
	public int sleep(){
		return Resources.generateResources();
	}
	
	private  boolean isBackpackFull(){
		if ( this.backpackIndex >= 5){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public void showBackpack(){
		System.out.println(Arrays.toString(this.backpack));
		if ( backpackIndex < 4){
			System.out.printf(" (%d) backpack slots left!", getNumberOfBackpackSlots());
		}
	}
	
	private int getNumberOfBackpackSlots(){
		return Constants.MINER_BACKPACK_SIZE - this.backpackIndex;
	
	}



}


