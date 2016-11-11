package javasmmr.zoowsome.models.animals;

public class Bear extends Mammal {
	public Bear(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setName(name);
		this.normalBodyTemp = normalBodyTemp;
		this.setNrOfLegs(nrOfLegs);
		this.percBodyHair = percBodyHair;
	}

	public Bear() {
		this.setName("Panda"); 
		this.normalBodyTemp = 35;
		this.setNrOfLegs(4);
		this.percBodyHair = 93;
	}
}
