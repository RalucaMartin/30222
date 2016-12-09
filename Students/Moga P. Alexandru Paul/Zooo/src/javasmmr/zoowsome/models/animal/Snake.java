package javasmmr.zoowsome.models.animal;

public class Snake extends Reptile {

	public Snake() {
		this("Snake",0,true);
	}

	public Snake(String name, int nrOfLegs, boolean layEggs){
		super(0.1, 0.9);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLaysEggs(layEggs);
	}
	
}
