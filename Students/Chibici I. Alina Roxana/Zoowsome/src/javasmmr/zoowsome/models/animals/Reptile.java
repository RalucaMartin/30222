package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	
	//attributes
	private Boolean laysEggs;

	//constructor
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	//methods
	public Boolean getLaysEggs() {
		return laysEggs;
	}
	
	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
	@Override
	public double getPredisposition() {
		return super.getPredisposition();
	}
}
