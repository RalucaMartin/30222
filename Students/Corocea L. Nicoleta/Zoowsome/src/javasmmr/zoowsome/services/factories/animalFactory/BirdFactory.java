package javasmmr.zoowsome.services.factories.animalFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.utils.Constants;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Hummingbird.equals(type)) {
			return new Hummingbird();
		} else if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		} else

		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
		}
		return null;
	}

}
