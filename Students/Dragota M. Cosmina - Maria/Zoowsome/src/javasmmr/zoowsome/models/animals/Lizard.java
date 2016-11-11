package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard(int noOfLegs, String name, boolean laysEggs) {
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
		// TODO Auto-generated constructor stub
	}
	public Lizard() {
		// TODO Auto-generated constructor stub
		this(4, "Salamandra", true);
	}
}
