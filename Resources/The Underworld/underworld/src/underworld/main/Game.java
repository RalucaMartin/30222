package underworld.main;

import java.util.Scanner;

public class Game {
	private static int minerNextAction;
	private static int valuableResources = 0;
	private static boolean minerSlept = false;
	private static Scanner scanner; // TODO: Initialize the value of scanner so that you can
									//       use it to read from keyboard
	
	public static void main(String[] args) throws InterruptedException {
		if (Constants.MINER_BACKPACK_SIZE > Constants.MAP_RESOURCES_NUMBER) {
			System.out.println("[Game] You bastard! Your miner can carry more than the map can offer!");
			return;
		}
		System.out.println("[Game] Welcome to " + Constants.WORLD_NAME + "!");
		// TODO: Print rules by calling method on FileReader utility class
		// 		 Use Constants class to get the path to file
		
		System.out.print("[Game] Please enter the name of our miner: ");
		
		// TODO: Read miner name and place it into a variable.. Look around for the variable name
		System.out.println("[Game] Miner '" + minerName + "' is getting ready to mine!");
		Thread.sleep(500);
		
		// TODO: Create a new miner with the name you have just read
		System.out.println("[Game] Miner '" + minerName + "': Show me where to dig!");
		Thread.sleep(1000);
		
		// TODO: Create a new map and generate the resources
		
		System.out.println("[Game] You have " + Constants.NUMBER_OF_ROUNDS + " rounds to find as many valuable resources as possible! Good luck!");
		
		for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
			
			Thread.sleep(1000);
			System.out.println("[Game] ###");
			System.out.println("[Game] #Round number: " + (i + 1));
			System.out.println("[Game] ###");
			
			Thread.sleep(1000);
			// TODO: Display the resources from the map
			
			Thread.sleep(1000);
			System.out.println("[Game] What should " + miner.getName() + " do next? Dig(1) or sleep(0)?");
			System.out.print("[Game] ");
			
			// TODO: Read an integer from the keyboard and update 
			//       the minerNextAction variable accordingly

			int resource;
			switch (minerNextAction) {
				case 0:
					i--;
					minerSlept = true;
					System.out.println("[Game] PSST! Our miner is sleeping..");
					Thread.sleep(2000);
					// TODO: Make the miner sleep and update the resource variable with the
					// 	     value returned by the sleep method
					break;
				case 1:
					minerSlept = false;
					System.out.println("[Game] GOGOGO! Our miner is digging..");
					Thread.sleep(2000);
					// TODO: Make the miner dig and update the resource variable with the
					// 	     value returned by the sleep method
					break;
				default:
					resource = 0;
					break;
			}
			
			Thread.sleep(1000);
			
			if (map.consumeResource(resource)) {
				if (minerSlept) {
					System.out.println("[Game] BOO! A valuable resource decayed because you slept!");
				}
				else {
					valuableResources ++;
					System.out.println("[Game] JACKPOT! Valuable resource found!");
				}
			}
			else {
				if (minerSlept) {
					System.out.println("[Game] PHEW! You almost dug for a useless resource!");	
				}
				else {
					System.out.println("[Game] BADLUCK! Try sleeping next time!");	
				}			
			}
			
		}
		
		System.out.println("[Game] ####################################");
		System.out.println("[Game] GAME OVER! Your miner found " + valuableResources + "/" + Constants.MAP_RESOURCES_NUMBER + " valuable resources");

		scanner.close(); 
		
		return;
	}
}


package underworld.utils;

public class Constants{

	public final static String WORLD_NAME = "JocMiner" ;
	public final static String PATH_TO_RULES_FILE = "C:\Users\acer\Desktop\30222\Students\Barzan D. Iulia Maria" ;
	public final static int MINER_BACKPACK_SIZE = 5 ;
	public final static int MAP_RESOURCES_NUMBER = 10 ;
	public final static String NUMBER_OF_ROUNDS = 5 ;
	
}

public class FileReader{
	public static void printFileContents (String pathToFile){
	}
}

public class Resources{
	private static Random random= new Random () ;
	
	public static int generateValuableResources (){
	}
	
	public static int generateResource (){
	}
}


package underworld.models;

public class Map (){
	private int[] resources ;
	
	public Map () {
		for ( int i = 0 ; i < resources.length ; i++ ) //initializam vectorul de resurse
			resources [i] = i ;
	}
	
	public boolean consumeResources (int resource){
		for ( int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++ ) {
			 			if ( resources[i] == resource ) {
			 				resources[i] = -1 ;
			 				return true ;
			 			}
			 
			 		}
			 		return false ;
	}
	
	public void showResources (){
		
	}

	public class Miner{
		private String name ;
		private int[] bagpack ;
		private int[] bagpackIndex ;
		
		public Miner (String name){   //constructor
			this.name = name ;
		}
	}
		
		public String getName (){
			return this.name ;
		}
		
		public void setName (String name){
			this.name = name ;
		}
		
		public int dig (){
			
			if ( isBackpackFull() == false) //verificam daca mai este loc in rucsac
			{
				backpackIndex = backpackIndex + 1 ; //marin numarul elementelor din rucsac
				backpack[backpackIndex] = Resources.generateResource() ; //adaugam o noua resursa
				 			return backpack[backpackIndex] ;
			}
			
			return -1 ; //in caz contrar returnez -1
		}
		
		public int sleep (){ //inside this method a resource should be generated by calling generateResoources
			int resourceValue = Resources.generateResource () ; 
	 		return resourceValue ;
		}
		
		private boolean isBackpackFull (){
			if ( backpackIndex == 9 ) { //rucsacul este plin cand indexul are valoare 9
				 			return true ;
			}
				 		
			return false ;
		}
		
		public void showBackpack (){
			System.out.println ( "Rucsacul contine:" ) ; 
			 		for ( int i = 0; i < backpack.length; i++ ) {
			 			System.out.println ( backpack[i] + " " ) ;
			 		}	
		}
		
		private getNumberOfBackpackSlots (){ //will return the number of empty slots left in our miner's backpack
			return ( 9 - backpackIndex ) ; 
			}
	}