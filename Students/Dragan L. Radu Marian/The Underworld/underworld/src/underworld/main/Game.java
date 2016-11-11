package underworld.main;

import java.util.Scanner;
import underworld.models.*;
import underworld.units.*;

public class Game {
	private static int minerNextAction;
	private static int valuableResources = 0;
	private static boolean minerSlept = false;
	private static Scanner scanner = new Scanner(System.in) ;
									// DONE: Initialize the value of scanner so that you can
									//       use it to read from keyboard
	
	public static void main(String[] args) throws InterruptedException {
		String minerName;
		System.out.println("[Game] Welcome to " + Constants.WORLD_NAME + "!");
		
		// DONE: Print rules by calling method on FileReader utility class
		// 		 Use Constants class to get the path to file
		
		FileReader.printFileContents(Constants.PATH_TO_RULES_FILE); 
		
		System.out.print("[Game] Please enter the name of our miner: ");
		
		// TODO: Read miner name and place it into a variable.. Look around for the variable name
		minerName = scanner.nextLine();
		
		System.out.println("[Game] Miner '" + minerName + "' is getting ready to mine!");
		Thread.sleep(500);
		
		// TODO: Create a new miner with the name you have just read
		Miner miner1 = new Miner(minerName);
		
		System.out.println("[Game] Miner '" + minerName + "': Show me where to dig!");
		Thread.sleep(1000);
		
		// TODO: Create a new map and generate the resources
		Map map1 = new Map();
		map1.generateResources();
		
		System.out.println("[Game] You have " + Constants.NUMBER_OF_ROUNDS + " rounds to find as many valuable resources as possible! Good luck!");
		
		for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
			
			Thread.sleep(1000);
			System.out.println("[Game] ###");
			System.out.println("[Game] #Round number: " + (i + 1));
			System.out.println("[Game] ###");
			
			Thread.sleep(1000);
			// TODO: Display the resources from the map
			map1.showResources();
			
			Thread.sleep(1000);
			System.out.println("[Game] What should " + miner1.getName() + " do next? Dig(1) or sleep(0)?");
			System.out.print("[Game] ");
			
			// TODO: Read an integer from the keyboard and update 
			//       the minerNextAction variable accordingly
			
			minerNextAction = scanner.nextInt();

			int resource;
			switch (minerNextAction) {
				case 0:
					i--;
					minerSlept = true;
					System.out.println("[Game] PSST! Our miner is sleeping..");
					Thread.sleep(2000);
					// TODO: Make the miner sleep and update the resource variable with the
					// 	     value returned by the sleep method
					resource = miner1.sleep();
					
					break;
				case 1:
					minerSlept = false;
					System.out.println("[Game] GOGOGO! Our miner is digging..");
					Thread.sleep(2000);
					// TODO: Make the miner dig and update the resource variable with the
					// 	     value returned by the sleep method
					resource = miner1.dig();
					break;
				default:
					resource = 0;
					break;
			}
			
			Thread.sleep(1000);
			
			if (map1.consumeResource(resource)) {
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
