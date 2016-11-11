package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile {
	public Lizzard(int nrOfLegs, String name, boolean laysEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.laysEggs = true;

	}

	public Lizzard() {
		this.setName("Lizzard");
		this.laysEggs = true;
		this.setNrOfLegs(4);

	}
}
