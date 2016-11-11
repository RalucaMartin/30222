package zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger() {
		setNrOfLegs(4);
		setName("Tiger");
		super.setNormalBodyTemp((float)37.5);
		super.setPercBodyHair(92);
	}
	
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, int percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}
	
}
