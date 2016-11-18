package underworld.units;
import java.util.Random;

public class Resources {
	private  static Random random = new Random();
	
	public static int generateValuableResources() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 + 1);
	}
	
	public static int generateResource() {
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
	}
}
