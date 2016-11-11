package zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow() {
		setNrOfLegs(4);
		setName("Cow");
		super.setNormalBodyTemp((float)37);
		super.setPercBodyHair(85);
	}
	
	public Cow(int nrOfLegs, String name, float normalBodyTemp, int percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}
	
}
