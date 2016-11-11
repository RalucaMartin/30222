package zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake() {
		setNrOfLegs(0);
		setName("Snake");
		super.setLaysEggs(true);
	}
	
	public Snake(int nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setLaysEggs(laysEggs);
	}
}