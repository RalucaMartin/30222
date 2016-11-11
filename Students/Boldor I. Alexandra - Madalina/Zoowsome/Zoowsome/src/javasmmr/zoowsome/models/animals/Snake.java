package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs,String name,Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Snake() {
		this(0,"Sarpe",true);
	}

}
