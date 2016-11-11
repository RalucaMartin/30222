package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Snake extends Reptile {
	public Snake() {
		super();
		this.setName(Animals.Reptiles.SNAKE);
		this.setNrOfLegs(0);
		this.layEggs=true;
	}
}
