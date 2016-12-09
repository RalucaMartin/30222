package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer_I {
	/**
	 * it is an abstract class – you cannot create any instance of it, however
	 * it can contain non-abstract methods and can be extended
	 */
	private int noOfLegs;
	private String name;
	public final double maintenanceCost;// hold how many hours per week will
										// this animal require attention
										// from employees of the zoo.
	public final double dangerPerc;// This field will represent how dangerous
									// an animal is in %.
	private boolean takenCareOf = false;

	/**
	 * 
	 * final fields have to be initialized in a constructor and their values
	 * cannot be changed
	 * 
	 * @return
	 */

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Random random = new Random(); double value = min + (max - min) *
	 * random.nextDouble();
	 */
	@Override
	public boolean kill() {
		Random random = new Random();
		double number = 1 * random.nextDouble();// genereaza nr intre [0,1]
		if (number < dangerPerc) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Animal() {

	}

	// am creat un constructor care va initializa final fields
	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

}
