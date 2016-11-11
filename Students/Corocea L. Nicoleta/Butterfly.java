package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		this.setName(name);
		this.canFly = canFly;
		this.setNrOfLegs(nrOfLegs);
		this.isDangerous = isDangerous;

	}

	public Butterfly() {
		this.setName("Butterfly");
		this.canFly = true;
		this.isDangerous = false;
		this.setNrOfLegs(10);

	}
}
