package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack = { 0, 5 };
	private int backpackIndex;

	public Miner(String name) {
		this.name = name;
		for (int i = 0; i < backpack.length; i++) {
			backpack[i] = -1;
		}
		backpackIndex = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int dig() {
		if (isBackpackFull() == false) {
			backpack[backpackIndex] = Resources.generateResource();
			backpackIndex++;
			return Resources.generateResource();
		}
		return 0;

	}

	public int sleep() {
		return Resources.generateResource();
	}

	private boolean isBackpackFull() {
		if (backpackIndex == backpack.length) {
			return true;
		}
		return false;

	}

	public void showBackpack() {
		System.out.println("The content of the backpack ");
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++) {
			System.out.println(" " + backpack[i]);
		}
		System.out.println("The number of empty slots: " + getNumberOfBackpackSlots());

	}

	private int getNumberOfBackpackSlots() {
		return (Constants.MINER_BACKPACK_SIZE - backpackIndex);
	}
}
