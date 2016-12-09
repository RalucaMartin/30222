package javasmmr.zoowsome.models.animal;

public class Cow extends Mammal{

	public Cow() {
		this("Cow",4,37f,80f);
	}

	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		super(0.1, 0.2);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

}
