package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer_i {
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangPerc;
	boolean takenCareOf = false;

	public Animal(double maintenanceCost2, double dangPerc2) {
		// TODO Auto-generated constructor stub
		this.maintenanceCost = maintenanceCost2;
		this.dangPerc = dangPerc2;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean kill() {
		Random random = new Random();
		double randomValue = random.nextDouble();
		if (randomValue < this.dangPerc) {
			return true;
		}
		return false;

	}

	public void SetTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public double getMaintenanceCost() {
		// TODO Auto-generated method stub
		return this.maintenanceCost;
	}
}
