package underworld.utils;

import java.util.*;

public class Resources {
	private static Random random = new Random();

	public static int generateValuableResource() {
		int r = random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
		return r;
	}

	public static int generateResource() {
		int r = random.nextInt((Constants.MAP_RESOURCES_NUMBER + 1) * 2);
		return r;
	}
}
