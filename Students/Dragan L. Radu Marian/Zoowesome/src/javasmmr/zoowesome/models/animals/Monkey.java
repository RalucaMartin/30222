package javasmmr.zoowesome.models.animals;

public class Monkey extends Mammal {
	public Monkey() {
		setNrOfLegs(2);
		setName("Mishu");
		normalBodyTemperature = 39;
		percBodyHair = 95;
	}
	
	public Monkey( String name, float percBodyHair, float normalBodyTemperature) {
		setNrOfLegs(2);
		setName(name);
		this.normalBodyTemperature = normalBodyTemperature;
		this.percBodyHair = percBodyHair;
	}
}