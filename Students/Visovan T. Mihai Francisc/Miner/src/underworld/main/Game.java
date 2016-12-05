package underworld.main;
import underworld.utils.FileReader;
import underworld.models.Miner;
import underworld.models.Map;
import java.util.Scanner;
import underworld.utils.Constants;

public class Game {
	
	private static String minerName = new String();
	private static int minerNextAction;
	private static int valuableResources = 0;
	private static boolean minerSlept = false;
	private static Scanner scanner = new Scanner(System.in); 
	public static Miner miner = new Miner();
	public static Map map = new Map();
	public static FileReader file = new FileReader();
	
	public static void main(String[] args) throws InterruptedException {
		if (Constants.MINER_BACKPACK_SIZE > Constants.MAP_RESOURCES_NUMBER) {
			System.out.println("[Game] You bastard! Your miner can carry more than the map can offer!");
			return;
		}
		System.out.println("[Game] Welcome to " + Constants.WORLD_NAME + "!");
		
		file.printFileContents(Constants.PATH_TO_RULES_FILE);
		
		System.out.print("[Game] Please enter the name of our miner: ");
		
		
		minerName = scanner.nextLine();
		miner.setName(minerName);
		
		System.out.println("[Game] Miner '" + minerName + "' is getting ready to mine!");
		Thread.sleep(500);
	
		
		System.out.println("[Game] Miner '" + minerName + "': Show me where to dig!");
		Thread.sleep(1000);
		
		
		map.map();
		map.generateResources();
		
	
		System.out.println("[Game] You have " + Constants.NUMBER_OF_ROUNDS + " rounds to find as many valuable resources as possible! Good luck!");
		
		for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
			
			Thread.sleep(1000);
			System.out.println("[Game] ###");
			System.out.println("[Game] #Round number: " + (i + 1));
			System.out.println("[Game] ###");
			
			Thread.sleep(1000);
		
			map.showResources();
			miner.showBackPack();
			
			
			Thread.sleep(1000);
			System.out.println("[Game] What should " + miner.getName() + " do next? Dig(1) or sleep(0)?");
			System.out.print("[Game] ");
			
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
					
					resource = miner.sleep();
					
					break;
				case 1:
					minerSlept = false;
					System.out.println("[Game] GOGOGO! Our miner is digging..");
					Thread.sleep(2000);
					// TODO: Make the miner dig and update the resource variable with the
					// 	     value returned by the sleep method
					
					resource = miner.dig();
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
	}
	}