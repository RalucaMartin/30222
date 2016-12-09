package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Seal extends Aquatic {
	
	public Seal(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Seal() {
		this.setNrOfLegs(0);
		this.setName("Seal");
		this.setAvgSwimDepth(4100);
		this.setWaterType(WaterType.SaltWater);
		this.setMaintenanceCost(4.6);
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
