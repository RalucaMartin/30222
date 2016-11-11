package underworld.utils;
import java.util.Random;
import underworld.utils.Constants;

public class Resources {
	private static Random random = new Random(1);
	
	//methods - copy paste style - the problem is that they do not involve my random variable
	//would love to discuss at our lab how we generate this random numbers
	public static int generateValuableResource(){
		return 0 + (int)(Math.random() * Constants.MAP_RESOURCES_NUMBER);
		//Method 2: return random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
	}
	public static int generateResource(){
		return 0 + (int)(Math.random() * (Constants.MAP_RESOURCES_NUMBER *2) );
		//Method 2: return random.nextInt(Constants.MAP_RESOURCES_NUMBER *2 + 1);
	}
}
