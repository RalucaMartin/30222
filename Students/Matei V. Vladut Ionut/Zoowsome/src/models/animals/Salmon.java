package models.animals;



public class Salmon extends Aquatic{

	public Salmon() {
		this("Salmon", 0, 7, Water.FRESHWATER, 3.1, 0.2);
	}

	public Salmon(String name, int nrOfLegs, int avgSwimDepth, Water waterType,double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

}
