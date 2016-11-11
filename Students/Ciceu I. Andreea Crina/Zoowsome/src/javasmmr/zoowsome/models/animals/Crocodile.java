package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile(int nrOfLegs, String name, boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Crocodile(){
		this(4, "Crocodile",true);
	}

}
