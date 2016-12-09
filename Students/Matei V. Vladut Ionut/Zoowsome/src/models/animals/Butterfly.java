package models.animals;


public class Butterfly extends Insect {

	public Butterfly() {
		this("Butterfly",2, true, false, 3.3, 0.1);
	}
	
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
