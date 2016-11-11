package javasmmr.zoowsome.models.animal;

public abstract class Aquatic extends Animal {
	private int avgSwimDetpth;
	private Enum waterType;
	public enum Enum{
		saltwater,
		freshwater
	}
	public int getAvgSwimDetpth() {
		return avgSwimDetpth;
	}
	public void setAvgSwimDetpth(int avgSwimDetpth) {
		this.avgSwimDetpth = avgSwimDetpth;
	}
	public Enum getWaterType() {
		return waterType;
	}
	public void setWaterType(Enum waterType) {
		this.waterType = waterType;
	}
	
}
