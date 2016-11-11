package javasmmr.zoowesome.models.animals;

public class Tiger extends Mammal {
	public Tiger() {
		setNrOfLegs(4);
		setName("Foxy");
		normalBodyTemperature = 37;
		percBodyHair = 95;
	}
	
	public Tiger( String name, float percBodyHair, float normalBodyTemperature) {
		setNrOfLegs(4);
		setName(name);
		this.normalBodyTemperature = normalBodyTemperature;
		this.percBodyHair = percBodyHair;
	}
}
