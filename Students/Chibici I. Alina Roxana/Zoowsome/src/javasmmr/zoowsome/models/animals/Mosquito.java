package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Mosquito extends Insect{
	
	public Mosquito(){
		this (true, true, "Mosquito", 6, 0.8, 0.2);	
	}
	
	public Mosquito(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int dayOfYear = LocalDateTime.now().getDayOfYear();
		if (dayOfYear > 90 && dayOfYear < 100){
			return 0.3;
		}
		else {
			return 0.0;
		}		
	}
}

