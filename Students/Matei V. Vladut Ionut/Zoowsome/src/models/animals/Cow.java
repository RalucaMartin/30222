package models.animals;

public class Cow extends Mammal {
	
	
	public Cow() {
		this("Cow", 4, 35.8f, 0.7f, 5.1, 0.3);
	}

	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}


}
