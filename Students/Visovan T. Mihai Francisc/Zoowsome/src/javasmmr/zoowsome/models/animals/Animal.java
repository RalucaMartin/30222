package javasmmr.zoowsome.models.animals;
import java.util.*;

public abstract class Animal implements Killer{

	
	
	double rangeMin = 0;
	double rangeMax = 1;
	Random r = new Random();
	double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	public double getPredisposition(){
		return 0;
	}

	public int nrOfLegs;
	protected String name;
	public final double maintenanceCost;
	public final double damagePerc;
	public boolean takenCareOf = false;
	
	public Animal(double maintenanceCost, double damagePerc){
		this.maintenanceCost = maintenanceCost;
		this.damagePerc = damagePerc;
	}
	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDamagePerc() {
		return damagePerc;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
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
}

