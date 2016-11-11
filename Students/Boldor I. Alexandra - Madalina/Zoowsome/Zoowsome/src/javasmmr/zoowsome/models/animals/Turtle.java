package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle(int nrOfLegs,String name,Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Turtle() {
		this(4,"Broscuta",true);
	}

}
