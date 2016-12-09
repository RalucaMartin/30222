package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(){
		this("Monkey",4,38,90);
	}
	public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
