package zoowsome.models.animals;

public class Lizzard extends Reptile {

	public Lizzard() {
		setNrOfLegs(4);
		setName("Lizzard");
		super.setLaysEggs(true);
	}
	
	public Lizzard(int nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setLaysEggs(laysEggs);
	}
}