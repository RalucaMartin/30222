package javasmmr.zoowsome.models.animals;
public abstract class Aquatic extends Animal {
	public Aquatic(Double maintenanceCost,Double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}
	public int avgSwimDepth;
	public Enum waterType;
	public enum Enum{
		Freshwater, Saltwater
	}
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public Enum getWaterType() {
		return waterType;
	}
	public void setWaterType(Enum waterType) {
		this.waterType = waterType;
	}
	
}
