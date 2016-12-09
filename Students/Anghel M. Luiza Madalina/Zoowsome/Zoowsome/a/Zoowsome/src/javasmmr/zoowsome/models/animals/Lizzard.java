package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Lizzard extends Reptile {
	
	public Lizzard(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Lizzard() {
		this.setNrOfLegs(4);
		this.setName("Lizzard");
		this.setLaysEggs(true);
		this.setMaintenanceCost(2.3);
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
