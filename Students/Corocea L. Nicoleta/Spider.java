package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		this.setName(name);
		this.canFly = canFly;
		this.setNrOfLegs(nrOfLegs);
		this.isDangerous = isDangerous;

	}

	public Spider() {
		this.setName("Spider");
		this.canFly = false;
		this.isDangerous = true;
		this.setNrOfLegs(8);

	}
}
