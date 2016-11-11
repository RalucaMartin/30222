package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	Integer avgSwimDepth;
	enum WaterType{SaltWater, FreshWater};
	WaterType waterType;
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public WaterType getWaterType() {
		return waterType;
	}
	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
}
