package models.animals;



public class Monkey extends Mammal{
	
	
	public Monkey() {
		this("Monkey", 2, 31.9f, 0.88f, 4.9, 0.5);
	}
	
	public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
}
