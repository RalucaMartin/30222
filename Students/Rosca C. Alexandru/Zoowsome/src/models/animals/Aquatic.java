package models.animals;

public abstract class Aquatic extends Animal {
	
	protected int avgSwimDepth;
	protected enum waterType  {saltWater, freshwater}
	
	public Aquatic(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public int getAvgSwinDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwinDepth(int avgSwinDepth) {
		this.avgSwimDepth = avgSwinDepth;
	}
	
	
	
}
