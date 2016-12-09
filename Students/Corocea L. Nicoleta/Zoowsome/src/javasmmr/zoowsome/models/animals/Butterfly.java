package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, canFly, isDangerous);
		this.setName(name);
		this.canFly = canFly;
		this.setNrOfLegs(nrOfLegs);
		this.isDangerous = isDangerous;

	}

	public Butterfly() {
		super(1, 0, true, false);
		this.setName("Butterfly");
		this.setNrOfLegs(10);

	}
}
