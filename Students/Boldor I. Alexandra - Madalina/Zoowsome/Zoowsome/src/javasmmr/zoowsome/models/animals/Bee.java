package javasmmr.zoowsome.models.animals;

public class Bee extends Insect{
	public Bee(int nrOfLegs,String name,Boolean canFly,Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Bee() {
		this(6,"Albinuta",true,true);
	}

}
