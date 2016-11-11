package javasmmr.zoowsome.models.animals;

public class Donkey extends Mammal {
	public Donkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setName(name);
		this.normalBodyTemp = normalBodyTemp;
		this.setNrOfLegs(nrOfLegs);
		this.percBodyHair = percBodyHair;
	}

	public Donkey() {
		this.setName("Donkey");
		this.normalBodyTemp = 40;
		this.setNrOfLegs(4);
		this.percBodyHair = 95;
	}
}
