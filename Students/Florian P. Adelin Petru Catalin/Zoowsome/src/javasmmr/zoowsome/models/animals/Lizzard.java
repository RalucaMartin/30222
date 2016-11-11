package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Lizzard extends Reptile {

	public Lizzard() {
		super();
		this.setName(Animals.Reptiles.LIZZARD);
		this.setNrOfLegs(4);
		this.layEggs=true;
	}
	
}
