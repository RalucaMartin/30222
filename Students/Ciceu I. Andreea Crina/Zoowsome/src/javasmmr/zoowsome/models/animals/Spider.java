package javasmmr.zoowsome.models.animals;

public class Spider extends Insects{

	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Spider() {
		this (10, "Paianjen", false, false); 
	
	}
}
