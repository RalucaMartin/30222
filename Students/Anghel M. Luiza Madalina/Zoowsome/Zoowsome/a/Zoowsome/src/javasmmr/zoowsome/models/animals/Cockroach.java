package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cockroach extends Insect {
	
	public Cockroach(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Cockroach() {
		this.setNrOfLegs(4);
		this.setName("Cockroach");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(2.1);
		this.setDangerPerc(0.1);
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
