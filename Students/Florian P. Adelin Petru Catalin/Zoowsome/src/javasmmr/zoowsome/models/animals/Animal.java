package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer_I {
	private int nrOfLegs;
	private String name;
	public final Double maintenanceCost;
	public final Double dangerPerc;
	public boolean takenCareOf=false;
	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	public Animal(Double maintenanceCost, Double dangerPerc){
		super();
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
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
	public boolean kill(){
		double x= Math.random();
		if(x<dangerPerc){
			return true;
		}
		return false;}
	public Double getMaintenanceCost() {
		return maintenanceCost;
	}
	public Double getDangerPerc() {
		return dangerPerc;
	}
}
