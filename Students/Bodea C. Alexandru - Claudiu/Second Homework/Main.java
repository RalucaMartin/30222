package underworld.main;
import underworld.models.Map;
import underworld.models.Miner;
import underworld.utils.Constants;
import underworld.utils.FileReader;

import java.util.Scanner;

public class Main {

	private static int valuableResources = 0;
	private static boolean minerSlept = false;
	private static Scanner scanner; 
	
	public static void main(String[] args) throws InterruptedException {
		
		scanner = new Scanner(System.in);
		
		
		if (Constants.MINER_BACKPACK_SIZE > Constants.MAP_RESOURCES_NUMBER) {
			System.out.println("[Game] You bastard! Your miner can carry more than the map can offer!");
		}
		System.out.println("[Game] Welcome to " + Constants.WORLD_NAME + "!");
		FileReader.printFileContests(Constants.PATH_TO_RULES);
		
		System.out.print("[Game] Please enter the name of our miner: ");
		
		
		String minerName = scanner.next();
		
		System.out.println("[Game] Miner '" + minerName + "' is getting ready to mine!");
		
		Thread.sleep(500);
		
		Miner miner = new Miner(minerName);
		
		System.out.println("[Game] Miner '" + minerName + "': Show me where to dig!");
		
		Thread.sleep(1000);
		
		Map map = new Map();
		
		System.out.println("[Game] You have " + Constants.NUMBER_OF_ROUNDS + " rounds to find as many valuable resources as possible! Good luck!");
		
		for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
			
			Thread.sleep(1000);
			System.out.println("[Game] ###");
			System.out.println("[Game] #Round number: " +(i+1) );
			System.out.println("[Game] ###");
			
			Thread.sleep(1000);
			map.showResource();
			
			System.out.println(" ");
			
			Thread.sleep(1000);
			System.out.println("[Game] What should " + miner.getName() + " do next? Dig(type dig) or sleep(type sleep)?");
			System.out.print("[Game] ");
			

			int resource;
			
			String minerNextAction = scanner.next();
			
			switch (minerNextAction) {
				case "sleep":
					i--;
					minerSlept = true;
					System.out.println("[Game] PSST! Our miner is sleeping..");
					Thread.sleep(2000);
					resource = miner.sleep();
					break;
				case "dig":
					minerSlept = false;
					System.out.println("[Game] GOGOGO! Our miner is digging..");
					Thread.sleep(2000);
					resource = miner.dig();
					break;
				default:
					resource = 0;
					break;
			}
			
			Thread.sleep(1000);

			if (map.consumeResource(resource)) {
				if (minerSlept) {
					System.out.println("[Game] BOO! A valuable resource decayed because you slept! Resource: "+ resource);
					System.out.println(" ");
					miner.showBackpack();
					System.out.println(" ");

				}
				else {
					valuableResources ++;
					System.out.println("[Game] JACKPOT! Valuable resource found! Resource: "+ resource);
					System.out.println(" ");
					miner.showBackpack();
					System.out.println(" ");

				}
			}
			else {
				if (minerSlept) {
					System.out.println("[Game] PHEW! You almost dug for a useless resource! Resource: "+ resource);
					System.out.println(" ");
					miner.showBackpack();
					System.out.println(" ");
				}
				else {
					System.out.println("[Game] BADLUCK! Try sleeping next time! Resource: "+ resource);	
					System.out.println(" ");
					miner.showBackpack();
					System.out.println(" ");

				}			
			}
			
		}
		
		System.out.println("[Game] ####################################");
		System.out.println("[Game] GAME OVER! Your miner found " + valuableResources + "/" + Constants.MAP_RESOURCES_NUMBER + " valuable resources");

		scanner.close(); 
		
		return;
	}
}
