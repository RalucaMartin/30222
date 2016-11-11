package javasmmr.zoowsome.models.animals;

public class Dragonfly extends Insect {
	public Dragonfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		this.setName(name);
		this.canFly = canFly;
		this.setNrOfLegs(nrOfLegs);
		this.isDangerous = isDangerous;

	}

	public Dragonfly() {
		this.setName("Dragonfly");
		this.canFly = true;
		this.isDangerous = false;
		this.setNrOfLegs(8);

	}
}
