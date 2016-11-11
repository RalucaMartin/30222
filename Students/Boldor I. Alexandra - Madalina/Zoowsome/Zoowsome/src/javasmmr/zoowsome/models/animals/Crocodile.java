package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile(int nrOfLegs,String name,Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Crocodile() {
		this(4,"Crocodil",true);
	}

}
