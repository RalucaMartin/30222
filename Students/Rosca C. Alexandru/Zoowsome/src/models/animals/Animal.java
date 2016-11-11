package models.animals;

import interfaces.*;
import java.util.*;

public abstract class Animal implements Killer{

	protected int nrOfLegs;
	protected String name;
	protected final double maintenanceCost;
	protected final double dangerPerc;
	Random random = new Random();
	private boolean takenCareOf = false;
	
	
	public Animal (double maintenaceCost, double dangerPerc){
		this.maintenanceCost = maintenaceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public double getPredisposition(){
		return 0;
	}
	
	
	public boolean kill(){
		double var = random.nextDouble();
		if (var < (dangerPerc + this.getPredisposition()))
			return true;
		else 
			return false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}


	public boolean isTakenCareOf() {
		return takenCareOf;
	}


	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}


	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
}
