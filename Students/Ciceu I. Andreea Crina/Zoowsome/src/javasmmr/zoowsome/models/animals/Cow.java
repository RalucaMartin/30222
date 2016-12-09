package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cow extends Mammal {
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(1.0,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);

	}
	public Cow () 
	{
		this(4, "Milka", 38, 98);
	}

	public boolean kill() {

		Random random = new Random();
		int ran = random.nextInt(10);
		if((ran/10) < dangerPerc) {
			return true;
		} 
		else {
			return false;
		}
	}
}
