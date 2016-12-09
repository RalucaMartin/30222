package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile {
	public Lizzard(int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangPerc) {
		super(maintenanceCost, dangPerc, laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Lizzard() {
		super(1.5, 0.1, true);
		this.setName("Lizzard");
		this.setNrOfLegs(4);

	}
}
