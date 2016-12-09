package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Piranha extends Aquatic{
	
	//constructors
	public Piranha(){
		this (50, typesOfWater.SALTWATER, "Piranha", 0, 1.2, 0.9);
	}
	
	public Piranha(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int hour = LocalDateTime.now().getHour();
		if (hour >= 13 && hour <= 14){
			return -0.8; //12.30 = feeding time ; so piranha's are full
		}
		else {
			return 0.0;
		}			
	}
}
