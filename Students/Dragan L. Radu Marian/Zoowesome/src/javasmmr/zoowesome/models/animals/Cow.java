package javasmmr.zoowesome.models.animals;

public class Cow extends Mammal {
	public Cow() {
		setNrOfLegs(4);
		setName("Ruji");
		normalBodyTemperature = 39;
		percBodyHair = 95;
	}
	
	public Cow( String name, float percBodyHair, float normalBodyTemperature) {
		setNrOfLegs(4);
		setName(name);
		this.normalBodyTemperature = normalBodyTemperature;
		this.percBodyHair = percBodyHair;
	}
}