package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	int avgSwimDepth;
	enum WaterType{SaltWater, FreshWater};
	WaterType waterType;
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public WaterType getWaterType() {
		return waterType;
	}
	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
}
