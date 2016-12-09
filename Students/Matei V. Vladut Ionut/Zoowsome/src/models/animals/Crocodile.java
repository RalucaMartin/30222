package models.animals;



public class Crocodile extends Reptile{

	public Crocodile() {
		this("Croco", 4, true, 6, 0.6);
	}
	
	public Crocodile(String name, int nrOfLegs, boolean layEggs, double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
