package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tiger extends Mammal {
	
	public Tiger(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	public Tiger() {
		this.setNrOfLegs(4);
		this.setName("Tiger");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(3.2);
		this.setDangerPerc(0.8);
	}

	@Override
	public boolean kill() {
		Random random = new Random();
		double i = random.nextInt(1);
		if(i < this.getDangerPerc()) {
			return true;
		} 	else return false;
	}
}
