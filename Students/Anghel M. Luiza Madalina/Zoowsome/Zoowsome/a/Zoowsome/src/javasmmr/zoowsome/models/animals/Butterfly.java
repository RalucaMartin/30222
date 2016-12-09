package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Butterfly extends Insect {
	
	public Butterfly(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	public Butterfly() {
		this.setNrOfLegs(4);
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(0.5);
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
