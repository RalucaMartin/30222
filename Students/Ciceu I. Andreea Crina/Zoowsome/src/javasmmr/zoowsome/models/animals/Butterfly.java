package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insects {
	
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Butterfly() {
		this (3, "Fluturas", true, false);
	}
}
