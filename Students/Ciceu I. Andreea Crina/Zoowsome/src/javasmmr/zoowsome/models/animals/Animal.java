package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.Interfeces.Killer_I;

public abstract class Animal implements Killer_I {
	
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	private boolean takenCareOf = false;
	
	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public int getNrOfLegs() {
		return this.nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	public String getName(){
		return this.name;
	}
	public void setName( String name) {
		this.name = name;
	}
	public Animal(double maintenanceCost, double dangerPerc ) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	

}
