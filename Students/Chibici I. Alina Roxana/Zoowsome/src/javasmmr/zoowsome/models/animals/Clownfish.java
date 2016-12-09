package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Clownfish extends Aquatic{
	
	//constructors
	public Clownfish(){
		this (30, typesOfWater.SALTWATER, "Clownfish", 0,1.8, 0);
	}
	
	public Clownfish(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int month = LocalDateTime.now().getMonthValue();
		if (month > 9 && month < 12){
			return 0.1;
		}
		else {
			return 0.0;	
		}
	}
}
