package models.animals;


public class Lizzard extends Reptile {

	public Lizzard() {
		this("Lizzard", 4, true, 2.9, 0.2);
	}

	public Lizzard(String name, int nrOfLegs, boolean layEggs, double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}


	
}
