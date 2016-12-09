package javasmmr.zoowsome.services.factories.animalFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.utils.Constants;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Aquatics.Piranha.equals(type)) {
			return new Piranha(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Clownfish.equals(type)) {
			return new Clownfish();
		} else

		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
		}
		return null;
	}

}
