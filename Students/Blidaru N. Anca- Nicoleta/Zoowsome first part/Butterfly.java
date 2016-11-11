package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Butterfly() {
		this(4, "Butterfly", true, false);
	}
}
