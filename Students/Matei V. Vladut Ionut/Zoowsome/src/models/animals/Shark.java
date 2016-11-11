package models.animals;

import java.util.Random;

public class Shark extends Aquatic{

	public Shark() {
		this("Shark", 0, 79, Water.SALTWATER, 7, 0.8);
		}

	public Shark(String name, int nrOfLegs, int avgSwimDepth, Water waterType,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

	@Override
	public boolean kill() {
		Random random = new Random();
		int survivingOdds = random.nextInt(10);
		
		if ((survivingOdds/10) < dangerPerc){
			return true;
		}
		return false;
	}
}
