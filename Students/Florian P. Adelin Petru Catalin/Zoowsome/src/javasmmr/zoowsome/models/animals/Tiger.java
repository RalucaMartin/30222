package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(){
		this("Tiger",4,38,90);
	}
	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
