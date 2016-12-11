package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal {
	public Lion(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, percBodyHair, normalBodyTemp);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Lion() {
		super(5, 1, 98, 40);
		this.setName("Simba");
		this.setNrOfLegs(4);
	}
}
