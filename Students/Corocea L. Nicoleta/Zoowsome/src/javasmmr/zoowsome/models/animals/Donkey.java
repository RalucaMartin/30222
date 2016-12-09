package javasmmr.zoowsome.models.animals;

public class Donkey extends Mammal {
	public Donkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, percBodyHair, normalBodyTemp);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Donkey() {
		super(3, 0.1, 98, 40);
		this.setName("Donkey");
		this.setNrOfLegs(4);

	}
}
