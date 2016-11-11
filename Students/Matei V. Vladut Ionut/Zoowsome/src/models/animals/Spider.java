package models.animals;

import java.util.Random;

public class Spider extends Insect {

	public Spider() {
		this("Spider", 8, false, true, 4, 0.6);
	}

	public Spider(String name, int nrOfLegs, boolean canFly, boolean isDangerous,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
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
