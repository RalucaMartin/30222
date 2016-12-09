package javasmmr.zoowsome.models.animal;

public class Tiger extends Mammal {

	public Tiger() {
		this("Tiger",4,37f,80f);
	}

	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		super(0.2, 0.9);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	
	
}
