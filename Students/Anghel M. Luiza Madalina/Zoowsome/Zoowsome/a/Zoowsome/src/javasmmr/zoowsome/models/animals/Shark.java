package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Shark extends Aquatic {
	
	public Shark(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Shark() {
		super();
		this.setNrOfLegs(0);
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.SaltWater);
		this.setMaintenanceCost(6.5);
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
