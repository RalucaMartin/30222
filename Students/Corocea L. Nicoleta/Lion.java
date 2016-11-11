package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal {
	public Lion(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setName(name);
		this.normalBodyTemp = normalBodyTemp;
		this.setNrOfLegs(nrOfLegs);
		this.percBodyHair = percBodyHair;
	}

	public Lion() {
		this.setName("Simba");
		this.normalBodyTemp = 38;
		this.setNrOfLegs(4);
		this.percBodyHair = 98;
	}
}
