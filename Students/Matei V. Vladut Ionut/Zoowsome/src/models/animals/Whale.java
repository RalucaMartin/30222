package models.animals;


public class Whale extends Aquatic {

	public Whale() {
		this("Whale", 0, 132, Water.SALTWATER, 2.3, 0.3);		
	}
	
	public Whale(String name, int nrOfLegs, int avgSwimDepth, Water waterType, double maintenanceCost, double dangerPerc){

		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
