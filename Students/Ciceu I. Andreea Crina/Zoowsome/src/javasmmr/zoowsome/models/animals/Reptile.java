package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	private boolean laysEggs;
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	public void setLaysEggs( boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
