package models.animals;



public class Turtle extends Reptile{

	public Turtle() {
		this("Mutant Ninja Turtle", 4, true, 1.9, 0.1);
	}
	
	public Turtle(String name, int nrOfLegs, boolean layEggs,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
