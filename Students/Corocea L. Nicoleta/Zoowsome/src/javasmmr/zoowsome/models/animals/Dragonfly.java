package javasmmr.zoowsome.models.animals;

public class Dragonfly extends Insect {
	public Dragonfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, canFly, isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Dragonfly() {
		super(1, 0, true, false);
		this.setName("Dragonfly");
		this.setNrOfLegs(8);

	}
}
