package models.animals;

import java.util.Random;

public class Cockroach extends Insect {

	public Cockroach() {
		this("Cockroach",4,false,true,3.9, 0.4);
		name = "Cockroach";
		nrOfLegs = 4;
		canFly = false;
		isDangerous = true;
	}

	public Cockroach(String name, int nrOfLegs, boolean canFly, boolean isDangerous,double maintenanceCost, double dangerPerc){
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
