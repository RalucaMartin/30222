package javasmmr.zoowsome.models.animal;

public class Turtle extends Reptile{

	public Turtle() {
		this("Turtle",4,true);;
	}

	public Turtle(String name, int nrOfLegs, boolean layEggs){
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLaysEggs(layEggs);
	}
	
}
