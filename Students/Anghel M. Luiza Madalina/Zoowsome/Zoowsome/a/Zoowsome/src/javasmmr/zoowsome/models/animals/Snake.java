package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Snake extends Reptile {
	
	public Snake(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Snake() {
		this.setNrOfLegs(0);
		this.setName("Snake");
		this.setLaysEggs(true);
		this.setMaintenanceCost(4.3);
		this.setDangerPerc(0.7);
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
