package javasmmr.zoowsome.services.factories.animalFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.utils.Constants;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.Alligator.equals(type)) {
			return new Alligator();
		} else if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard();
		} else

		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
		}
		return null;
	}

}
