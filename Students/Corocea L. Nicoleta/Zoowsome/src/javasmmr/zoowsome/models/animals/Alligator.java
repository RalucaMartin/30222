package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile {
	public Alligator(int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangPerc) {
		super(maintenanceCost, dangPerc, laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Alligator() {
		super(3, 0.9, true);
		this.setName("Alligator");
		this.setNrOfLegs(4);

	}
}
