package models.animals;



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

}
