package models.animals;

import java.util.Random;

public class Cow extends Mammal {
	
	
	public Cow() {
		this("Cow", 4, 35.8f, 0.7f, 5.1, 0.3);
	}

	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

	@Override
	public boolean kill() {
		Random random = new Random();
		int survivingOdds = random.nextInt(10);
		
		if ((survivingOdds/10) < dangerPerc){
			return true;
		}
		return false;
	}
}
