package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(int nrOfLegs,String name,Boolean canFly,Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Spider() {
		this(8,"Paianjen",false,true);
	}

}
