package models.animals;

public abstract class Aquatic extends Animal {
	public int avgSwimDepth;
	public enum Water {
		SALTWATER, FRESHWATER
	}
	public Water waterType;
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public Water getWaterType() {
		return waterType;
	}
	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}
}
