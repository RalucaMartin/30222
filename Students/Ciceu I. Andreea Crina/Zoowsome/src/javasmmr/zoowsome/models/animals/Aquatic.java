package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	private int avgSwimDepth;
	public enum waterType {saltWater, freshWater};
	private waterType water;
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public waterType getWater() {
		return this.water;
	}
	public void setWater(waterType water) {
		this.water = water;
	}
	

}
