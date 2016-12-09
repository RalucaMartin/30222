
package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	public enum WaterType{
		saltwhater, freshwater
	}
	private WaterType waterType;
	
	public Integer getAvgSwimDepth (){
		return this.avgSwimDepth;
	}
	public void setAvgSwimDepth ( Integer avgSwimDepth ){
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public WaterType getWaterType(){
		return this.waterType;
	}
	public void setWaterType ( WaterType waterType){
		this.waterType=waterType;
	}

}
