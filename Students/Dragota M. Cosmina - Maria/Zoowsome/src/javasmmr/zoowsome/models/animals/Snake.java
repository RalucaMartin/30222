package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{

	public Snake(int noOfLegs, String name, boolean laysEggs) {
		
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
		
	}
	
	public Snake() {
		// TODO Auto-generated constructor stub
		this(0, "Anaconda", true);
	}

}
