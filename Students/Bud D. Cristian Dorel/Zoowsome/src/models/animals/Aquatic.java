package models.animals;

public class Aquatic extends Animal{
	protected enum WaterType{
		saltwater, freshwater
	}
	
	private Integer avgSwimDepth;
	public WaterType waterType;
	
	
	public Integer getAvgSwimDepth(){
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public WaterType getWaterType(){
		return this.waterType;
	}
	
	public void setWaterType(WaterType waterType){
		this.waterType = waterType;
	}
}
