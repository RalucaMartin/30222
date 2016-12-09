package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Monkey extends Mammal {
	public Monkey (int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(0.3,0.7);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		
	}
	public Monkey() {
		this(4, "MojoJojo", 40, 68);
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
