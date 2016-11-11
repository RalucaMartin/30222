package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Cow() {
		this(4, "Joiana", 38, 75);
	}

}
