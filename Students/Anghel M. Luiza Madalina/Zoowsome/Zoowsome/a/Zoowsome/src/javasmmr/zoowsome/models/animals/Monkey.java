package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Monkey extends Mammal {
	
	public Monkey(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Monkey() {
		this.setNrOfLegs(4);
		this.setName("Monkey");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(4.3);
		this.setDangerPerc(0.2);
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
