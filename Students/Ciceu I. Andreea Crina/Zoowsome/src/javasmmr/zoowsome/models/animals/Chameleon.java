package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	public Chameleon(int nrOfLegs, String name, boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Chameleon(){
		this(4, "Cameleon",true);
	}
}
