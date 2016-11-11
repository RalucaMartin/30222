package underworld.models;

import java.util.Scanner;

import underworld.utils.Resources;

public class Miner {
	private int[] backpack = new int[5];
	private int backpackIndex = 0;
	int j, resource = 0, i = 0, empty = 0;

	public Miner(String name) {
		for (j = 0; j < backpack.length; j++) {
			backpack[j] = -1;
		}
	}

	public String getName() {
		Scanner scanner = new Scanner(System.in);
		String name;
		name = scanner.nextLine();
		return name;
	}

	public void setName(String name) {

	}

	public int dig() {
		if (!isBackpackFull()) {
			resource = Resources.generateResource();
			for (i = 0; i < backpack.length; i++) {
				if (backpack[i] == -1) {
					backpack[i] = resource;
					break;
				}
			}
			return resource;
		} else {
			System.out.println("The backpack is FULL");
			return 0;
		}

	}

	public int sleep() {
		resource = Resources.generateResource();
		return resource;
	}

	private boolean isBackpackFull() {
		int ok = 0;
		for (j = 0; j < backpack.length; j++) {
			if (backpack[j] == -1)
				ok = 1;
		}
		if (ok == 1)
			return false;
		else
			return true;
	}

	public void showBackpack() {
		for (j = 0; j < backpack.length; j++)
			System.out.println(backpack[j]);
		getNumberOfBackpackSlots();

	}

	private void getNumberOfBackpackSlots() {
		for (j = 0; j < backpack.length; j++) {
			if (backpack[j] == -1)
				empty++;
		}
		System.out.println(empty + "Slots are empty");
	}

}
