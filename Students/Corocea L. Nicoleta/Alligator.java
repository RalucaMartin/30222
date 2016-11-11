package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile {
	public Alligator(int nrOfLegs, String name, boolean laysEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.laysEggs = true;

	}

	public Alligator() {
		this.setName("Alligator");
		this.laysEggs = true;
		this.setNrOfLegs(4);

	}
}
