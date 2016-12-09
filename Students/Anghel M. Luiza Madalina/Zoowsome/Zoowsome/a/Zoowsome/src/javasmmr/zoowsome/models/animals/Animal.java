package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer_I {
	private Integer nrOfLegs;
	private String name;
	private Double maintenanceCost;
	private Double dangerPerc;
	private Boolean takenCareOf;
	
	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String Name) {
		this.name = name;
	}
	
	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	
	public final void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	public Double getDangerPerc() {
		return this.dangerPerc;
	}
	
	public final void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
	
	public Boolean isTakenCareOf() {
		return this.takenCareOf;
	}
	
	public void setTakenCareOf(Boolean takenCareOf) {
		takenCareOf = false;
		this.takenCareOf = takenCareOf;
	}
}
