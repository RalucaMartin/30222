package underworld.models;

import underworld.utils.Resources;



public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex; //index for the backpack
	
	
	public Miner( String name ) {
		this.name = name;
		backpack = new int[5];
		this.backpackIndex = 0;
		
		for( int i = 0; i <= 4; i++){
			backpack[i] = -1;
		}
	}
		
		public String getName() {
			
			return this.name;
	}
		
		public int dig() {
			int resource;
			
			if( backpackIndex < 4 && (backpack[backpackIndex] == -1)) {
				resource = Resources.generateResource();
				backpack[backpackIndex] = resource;
				backpackIndex++;
				return resource;
				
			}
			else {
				return 0;
			}
		}
	
	public int sleep () {
		
		int resource = Resources.generateResource();
		return resource;
		
	}
	


	public void showBackpack() {
		System.out.println("This is what you have now in your backpack");
		
		for ( int i = 0; i <= 4; i++){
			System.out.print(" " + backpack[i]);
		}
		System.out.println(" ");
		System.out.println("The number of empty slots in you backpack is:" + getNumberOfBackpackSlots());
		System.out.println(" ");
	}
		
		private int getNumberOfBackpackSlots(){
			int emptyBackpackSlots = 0;
			for( int i = 0; i <= 4; i++){
				if (backpack[i] == -1){
					emptyBackpackSlots += 1;
				}
			}
			
			return emptyBackpackSlots;
		}
	}
	
