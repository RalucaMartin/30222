package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	
	//attributes
	private int avgSwimDepth;
	public enum typesOfWater {SALTWATER , FRESHWATER}
	private typesOfWater waterType;
	
	//Constructor
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	//methods
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public typesOfWater getWaterType() {
		return waterType;
	}
	
	public void setWaterType(typesOfWater waterType) {
		this.waterType = waterType;
	}
	
	@Override
	public double getPredisposition(){
		return super.getPredisposition();
	}
}
