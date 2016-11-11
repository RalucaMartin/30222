package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, boolean laysEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.laysEggs = true;

	}

	public Snake() {
		this.setName("Snake");
		this.setNrOfLegs(0);
	}
}
