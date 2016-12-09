package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Crocodile extends Reptile {
	
	public Crocodile(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Crocodile() {
		this.setNrOfLegs(4);
		this.setName("Crocodile");
		this.setLaysEggs(true);
		this.setMaintenanceCost(5.6);
		this.setDangerPerc(0.9);
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
