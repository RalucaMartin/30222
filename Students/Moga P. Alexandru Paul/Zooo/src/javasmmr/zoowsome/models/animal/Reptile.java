package javasmmr.zoowsome.models.animal;

public abstract class Reptile extends Animal {
	private boolean laysEggs;
	

	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
}
