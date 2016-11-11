package underworld.models;

import java.util.Arrays;
import underworld.utils.*;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex;
	
	public Miner( String name ) {
		this.name = name;
		backpack = new int[Constants.MINER_BACKPACK_SIZE];
		for( int i = 0; i < backpack.length; i++ ) {
			backpack[i] = -1;
		}
	}
	
	public String getName() {
		return this.name;
	}

	public void setName( String name ) {
		this.name = name;
	}
	
	public int dig() {
		if( isBackpackFull() == false ) {
			backpack[backpackIndex] = Resources.generateResource() ; 
			return Resources.generateResource() ;
		} else {
			return 0; //the backpack is full
		}
	}
	
	public int sleep() {	
		return Resources.generateResource();
	}
	
	private boolean isBackpackFull() {
		if ( backpack[ backpack.length - 1 ] == -1 ) {
			return false;
		} else {
			return true;
		}
	}
	
	public void showBackpack() { 
		System.out.println("[Miner] My backpack :" + Arrays.toString(backpack)+ " => "+getNumberOfBackpackSlots() +" backpack slots left");
	}
	
	private int getNumberOfBackpackSlots() {
		int i;
		for( i = 0; i < backpack.length; i++) {
			if( backpack[i] == -1) {
				break;
			}
		}
		backpackIndex = i;
		return backpack.length-i;
	}	
}
