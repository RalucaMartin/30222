package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangPerc) {
		super(maintenanceCost, dangPerc, laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Snake() {
		super(1, 0.7, true);
		this.setName("Snake");
		this.setNrOfLegs(0);
	}
}
