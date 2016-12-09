package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(){
		this("Snake",0,true);
	}
	public Snake(String name, int nrOfLegs, boolean layEggs) {
		super(0.2,0.5);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}
}
