package services.factories.animal;

import models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.WAXWING.equals(type)) {
			return new Waxwing(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.EAGLE.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.CHICKEN.equals(type)) {
			return new Chicken();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
