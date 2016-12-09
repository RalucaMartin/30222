package models.animals;



public class Tiger extends Mammal {
	
	public Tiger() {
		this("Tiger", 4, 50f, 1f, 3.2, 0.9);
	}

	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
