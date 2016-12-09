package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile {
	public Alligator(){
		this("Alligator",4,true);
	}
	public Alligator(String name, int nrOfLegs, boolean layEggs) {
		super(0.3,0.5);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}
}
