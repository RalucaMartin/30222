package models.animals;

public class Dolphin extends Aquatic{
	public Dolphin (String name, Integer avgSwimDepth, WaterType watertype ){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(watertype);
		
	}
	
	public Dolphin(){
		this("Dolphin", 30, WaterType.saltwater);
	}
}
