package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Dolphin extends Aquatic {
	
	public Dolphin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Dolphin() {
		this.setNrOfLegs(0);
		this.setName("Dolphin");
		this.setAvgSwimDepth(300);
		this.setWaterType(WaterType.SaltWater);
		this.setMaintenanceCost(8.4);
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

