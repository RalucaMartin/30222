package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;
	/*public Reptile() {
		// TODO Auto-generated constructor stub
	}*/
	public Boolean isLayingEggs() {
		return this.laysEggs;
	}
	public void setLaysEggs(Boolean laysEggs){
		this.laysEggs = laysEggs;
	}

}
