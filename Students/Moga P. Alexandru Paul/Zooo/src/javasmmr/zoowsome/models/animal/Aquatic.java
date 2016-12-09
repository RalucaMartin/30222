package javasmmr.zoowsome.models.animal;

public abstract class Aquatic extends Animal {
	private int avgSwimDetpth;
	public enum Water {
		SALTWATER, FRESHWATER
	}
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
	public Water waterType;
	public int getAvgSwimDetpth() {
		return avgSwimDetpth;
	}
	public void setAvgSwimDetpth(int avgSwimDetpth) {
		this.avgSwimDetpth = avgSwimDetpth;
	}
	public Water getWaterType() {
		return waterType;
	}
	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}

	
}
