package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	public Aquatic(double maintenanceCost, double damagePerc) {
		super(maintenanceCost, damagePerc);
		// TODO Auto-generated constructor stub
	}
	int avgSwimDepth;
	public enum waterType {
		
		saltwater, freshwater
	}
	
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
}
