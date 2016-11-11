package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	Integer avgSwimDepth;
	enum waterType{saltwater, freshwater};
	waterType water;
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;	
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public waterType getWaterType() {
		return this.water;	
	}
	
	public void setWaterType(waterType water) {
       this.water = water;
    }
}
