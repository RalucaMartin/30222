package underworld.models;

import java.util.Arrays;

//import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	private int[] resources;

	/**
	 * The declaration allocates only enough space for a reference to an array
	 * (typically 4 bytes), but doesn't create the actual array object. numele
	 * array-ului e pointer la un obiect al sau
	 */

	/**
	 * Inside here you should make sure you have some default values inside your
	 * resources array
	 */
	public Map() { // constructor

		int [] resources = new int[100];// se vor initializa cu 0 by default
		//ar fi gresit sa scriu: resources = new int[100] ?
	}

	/**
	 * Update the values in the resources array with some new values. Use the
	 * static method generateValuableResource() from the Resources class.
	 */
	public void generateResources() {

		for (int i = 0; i < resources.length; i++) {
			resources[i] = Resources.generateValuableResource();
		}

	}

	public boolean consumeResource(int resource) {

		boolean isFound = false;

		for (int i = 0; i < resources.length; i++) { // parcurg tot array-ul
														// pana gasesc resursa
			if (resource == resources[i]) {// cand am gasit resursa fac update
											// pe acea pozitie si returnez true
				resources[i] = -1;
				isFound = true;

			} else {
				isFound = false;
			}

		}
		if (isFound == true) {
			return isFound;
		} else {
			return false;
		}
	}

	public void showResources() {
		// for(int i = 0; i<Constants.MAP_RESOURCES_NUMBER; i++){
		// System.out.print("%d, ", resources[i]);
		System.out.println(Arrays.toString(resources));
	}
}
