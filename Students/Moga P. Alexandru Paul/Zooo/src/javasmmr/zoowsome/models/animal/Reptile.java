package javasmmr.zoowsome.models.animal;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public boolean getIsLaysEggs() {
		return laysEggs;
	}

	public void setIsLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
}
