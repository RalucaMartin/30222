package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Snake() {
		this(0, "Anaconda", true);
	}
}
