package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Alligator;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Tortoise;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.CHAMELEON.equals(type)) {
			return new Chameleon(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.TORTOISE.equals(type)) {
			return new Tortoise();
		} else if (Constants.Animals.Reptiles.ALLIGATOR.equals(type)) {
			return new Alligator();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
