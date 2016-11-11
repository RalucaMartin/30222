package underworld.models;

import underworld.utils.*;

public class Map {
	private int[] resources;

	public Map() {
		resources = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	}

	public void generateResources() {
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			resources[i] = Resources.generateValuableResource();
		}
	}

	public boolean consumeResource(int resource) {
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			if (resources[i] == resource) {
				resources[i] = -1;
				return true;
			}

		}
		return false;
	}

	public void showResources() {
		System.out.print("Your resources are: ");
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			System.out.println(resources[i] + " ");
		}
		System.out.println();

	}

}
