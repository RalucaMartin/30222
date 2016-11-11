package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Tiger() {
		this(4, "Tiger", 40, 100);
	}
}
