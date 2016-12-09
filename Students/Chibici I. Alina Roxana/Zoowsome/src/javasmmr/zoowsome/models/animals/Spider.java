package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Spider extends Insect{
	
	//constructors
	public Spider(){
		this (true, true, "Spider", 8, 6.7, 0.5);	
	}
	
	public Spider(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int hour = LocalDateTime.now().getHour();
		if (hour > 23 || hour < 6){
			return 0.25; 
		}
		else {
			return 0.0;
		}	
	}
}
