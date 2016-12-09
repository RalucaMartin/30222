package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Tuna extends Aquatic{
	
	//constructors
	public Tuna(){
		this (1000, typesOfWater.SALTWATER, "Tuna", 0, 0.8, 0.0);
	}
	
	public Tuna(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int dayOfMonth = LocalDateTime.now().getDayOfMonth();
		if (dayOfMonth >= 3 && dayOfMonth <= 10){
			return 0.15;
		}
		else {
			return 0.0;
		}
	}
}

