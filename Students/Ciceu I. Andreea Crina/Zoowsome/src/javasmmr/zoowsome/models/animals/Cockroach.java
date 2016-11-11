package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insects {

	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Cockroach () {
		this (4, "Gandac", false, true); 
	
	}
}
