package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer{
	
	//attributes
	private int nrOfLegs = 0;
	private String name = "Undefined";
	private final double maintenanceCost;
	private final double dangerPerc;
	private Boolean takenCareOf = false;
	
	//constructors
	public Animal (double maintenanceCost, double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	//methods
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getMaintenanceCost(){
		return this.maintenanceCost;
	}
	
	public double getdangerPerc(){
		return this.dangerPerc;
	}
	
	public boolean kill(){
		Random random = new Random ();
		double chance;
		chance = random.nextDouble();
		if (chance < (dangerPerc + this.getPredisposition())){
			return true;
		}
		else {
			return false;
		}	
	}
	
	public Boolean getTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public double getPredisposition(){
		return 0;
	}
}
