package zoowsome.models.animals;

public class Alligator extends Reptile {

	public Alligator() {
		setNrOfLegs(4);
		setName("Alligator");
		super.setLaysEggs(true);
	}
	
	public Alligator(int nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setLaysEggs(laysEggs);
	}
}