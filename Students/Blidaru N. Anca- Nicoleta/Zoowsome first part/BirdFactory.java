package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Birds.Vulture.equals(type)) {
			return new Vulture(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Swan.equals(type)) {
			return new Swan();
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
