package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(){
		this("Cow",4,38,90);
	}
	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
