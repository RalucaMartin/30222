package javasmmr.zoowsome.models.animal;

import java.util.Random;

public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	private boolean takenCareOf = false;
	
	
	public Animal(double maintenanceCost, double dangerPerc) {
		super();
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public boolean kill(){
		Random random = new Random();
		double n = random.nextDouble()*1;
		if(n<dangerPerc)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	public double getDangerPerc() {
		return dangerPerc;
	}
	
}