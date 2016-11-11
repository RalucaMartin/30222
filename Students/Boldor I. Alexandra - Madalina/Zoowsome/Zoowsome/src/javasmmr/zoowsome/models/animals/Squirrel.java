package javasmmr.zoowsome.models.animals;

public class Squirrel extends Mammal {
	public Squirrel(int nrOfLegs,String name,float normalBodyTemp,float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public Squirrel() {
		this(4,"Veverita",32,96);
	}

}
