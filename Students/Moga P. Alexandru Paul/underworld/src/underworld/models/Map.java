package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	private int[] resources = new int[Constants.MAP_RESOURCES_NUMBER];
	int i, ok = 0, ok1 = 0;

	public boolean Map() {
		for (i = 0; i < resources.length; i++) {
			if (resources[i] != -1)
				ok = 1;
		}
		if (ok == 0) {

			return true;
		} else {
			ok = 0;
			return false;
		}

	}

	public void generateResources() {
		for (i = 0; i < resources.length; i++) {
			resources[i] = Resources.generateValuableResource();
		}
	}

	public boolean consumeResources(int resource) {
		for (i = 0; i < resources.length; i++) {
			if (resources[i] == resource) {
				resources[i] = -1;
				ok1 = 1;
			}

		}
		if (ok1 == 1) {
			ok1 = 0;
			return true;
		} else {
			return false;
		}

	}

	public void showResources() {
		for (i = 0; i < resources.length; i++) {
			System.out.println(resources[i]);
		}
	}

}
