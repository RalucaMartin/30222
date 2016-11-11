package underworld.utils;

import java.util.Random;

public class Resources {
	private static Random random = new Random();

	/**
	 * Generate a random number between 0 and Constants.MAP_RESOURCES_NUMBER;
	 * limits included.
	 * Metodele statice sunt metode la nivelul clasei si nu au legatura cu obiectul
	 * Prin urmare nu e nevoie sa creez un obiect cu ajutorul caruia sa apelez metoda
	 * Ea se poate apela direct cu numele
	 * @return
	 */
	public static int generateValuableResource() { 

		int i;
		int[] randomValue;
		randomValue = new int[100];
		for (i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			randomValue[i] = (int) (Math.random() * 100);// return a value
															// between 0-99
			//clasa MATH nu este instantiabila!
		}

		return randomValue[i];
	}

	/**
	 * Generate a random number between 0 and Constants.MAP_RESOURCES_NUMBER * 2;
	 * limits included.
	 * 
	 * @return
	 */
	public static int generateResource() {
		int i;
		int[] randomValue;
		randomValue = new int[100];
		for (i = 0; i < (Constants.MAP_RESOURCES_NUMBER * 2); i++) {
			randomValue[i] = (int) (Math.random() * 200);// return a value
															// between 0-199
		}

		return randomValue[i];
	}

}
