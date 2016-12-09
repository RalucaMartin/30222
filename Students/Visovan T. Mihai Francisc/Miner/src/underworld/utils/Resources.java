package underworld.utils;
import java.util.Random;

public class Resources {
	 public static Random random = new Random();

	 
	 public static int generateValuableResource(){
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER);
		 }
	 
	 public static int  generateResource (){
		 return random.nextInt(Constants.MAP_RESOURCES_NUMBER*2);		 
	 }

}
