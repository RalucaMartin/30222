package javasmmr.zoowsome.models.animal;

public class Monkey extends Mammal{

	public Monkey() {
		this("Monkey",2,37f,80f);
	}

	public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	
}
