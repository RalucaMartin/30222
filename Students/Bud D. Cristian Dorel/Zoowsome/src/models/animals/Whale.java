package models.animals;

public class Whale extends Aquatic{
	public Whale (String name, Integer avgSwimDepth, WaterType watertype ){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(watertype);
		
	}
	public Whale(){
		this("Whale", 50, WaterType.saltwater);
	}
}
