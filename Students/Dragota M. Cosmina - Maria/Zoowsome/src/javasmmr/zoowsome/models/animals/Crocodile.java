package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{

	public Crocodile(int noOfLegs, String name, boolean laysEggs){
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Crocodile() {
		// TODO Auto-generated constructor stub
		this(4, "Crocodilul de Nil" ,true);
	}

}
