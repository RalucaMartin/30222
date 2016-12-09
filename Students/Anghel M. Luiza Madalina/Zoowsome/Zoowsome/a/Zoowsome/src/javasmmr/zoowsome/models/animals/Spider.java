package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Spider extends Insect {
	
	public Spider(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Spider() {
		this.setNrOfLegs(8);
		this.setName("Spider");
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setMaintenanceCost(2.5);
		this.setDangerPerc(0.5);
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
