package services.factories.animal;

import models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.WHALE.equals(type)) {
			return new Whale(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.SHARK.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.SALMON.equals(type)) {
			return new Salmon();
		} else  {
			throw new Exception("Invalid animal exception!");
		}
	}

}
