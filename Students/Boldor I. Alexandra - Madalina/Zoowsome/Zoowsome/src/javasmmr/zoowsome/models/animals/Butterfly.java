package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs,String name,Boolean canFly,Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Butterfly() {
		this(6,"Fluturas",true,false);
	}

}
