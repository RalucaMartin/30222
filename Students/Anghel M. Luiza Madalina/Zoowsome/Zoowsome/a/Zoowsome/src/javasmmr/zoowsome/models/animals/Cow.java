package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cow extends Mammal {
	
	public Cow(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Cow() {
		this.setNrOfLegs(4);
		this.setName("Cow");
		this.setNormalBodyTemp(38);
		this.setPercBodyHair(80);
		this.setMaintenanceCost(4.5);
		this.setDangerPerc(0.0);
	}
	
	@Override
	public boolean kill() {
		Random random = new Random();
		int i = random.nextInt(1);
		if(i < this.getDangerPerc()) {
			return true;
		} 	else return false;
	}
}
