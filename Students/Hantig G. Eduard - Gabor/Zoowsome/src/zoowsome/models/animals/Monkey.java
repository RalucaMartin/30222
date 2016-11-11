package zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey() {
		setNrOfLegs(4);
		setName("Monkey");
		super.setNormalBodyTemp((float)37);
		super.setPercBodyHair(79);
	}
	
	public Monkey(int nrOfLegs, String name, float normalBodyTemp, int percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}
	
}