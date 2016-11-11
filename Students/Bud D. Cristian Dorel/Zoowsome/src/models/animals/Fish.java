package models.animals;

public class Fish extends Aquatic{
	private enum FishType{
		carp, goldenfish, atlantic
	}
	
	private FishType fishType;
	
	public FishType getFishType(){
		return this.fishType;
	}
	
	public void setFishType(FishType fishType){
		this.fishType = fishType;
	}
	
	public Fish (String name, Integer avgSwimDepth, WaterType watertype ){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(watertype);
		
	}
	
	public Fish(){
		this("Fish", 20, WaterType.freshwater);
	}
}
