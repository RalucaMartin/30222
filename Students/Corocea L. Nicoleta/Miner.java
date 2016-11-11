package underworld.models;

import javax.annotation.Resource;

import underworld.utils.Resources;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex;

	public Miner(String name) {
		this.name = name;
		backpack = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int dig() {
		if (!isBackpackFull()) {
			backpackIndex++;
			backpack[backpackIndex] = Resources.generateResource();
			return backpack[backpackIndex];
		}
		return -1;
	}

	public int sleep() {
		return Resources.generateResource();
	}

	private boolean isBackpackFull() {
		if (backpackIndex == 9) {
			return true;
		}
		return false;
	}

	public void showBackpack() {
		System.out.println("My backpack: ");
		for (int i = 0; i <= backpackIndex; i++) {
			System.out.print(backpack[i] + " ");
		}
		System.out.println(" (" + getNumberOfBackpackSlots() + ") backpack slots left!");
	}

	private int getNumberOfBackpackSlots() {
		return (9 - backpackIndex);
	}

}
