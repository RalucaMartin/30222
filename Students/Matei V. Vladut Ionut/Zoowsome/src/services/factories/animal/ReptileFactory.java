package services.factories.animal;

import models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.LIZZARD.equals(type)) {
			return new Lizzard(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.TURTLE.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptiles.CROCODILE.equals(type)) {
			return new Crocodile();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
