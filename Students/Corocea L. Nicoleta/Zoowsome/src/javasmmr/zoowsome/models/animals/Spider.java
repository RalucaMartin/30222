package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, canFly, isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Spider() {
		super(1, 0.6, false, true);
		this.setName("Spider");
		this.setNrOfLegs(8);

	}
}
