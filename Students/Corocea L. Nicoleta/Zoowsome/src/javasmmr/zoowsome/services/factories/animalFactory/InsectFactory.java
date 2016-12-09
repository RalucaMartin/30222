package javasmmr.zoowsome.services.factories.animalFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.utils.Constants;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(); // leave empty constructor, for now!
		} else if (Constants.Animals.Insects.Dragonfly.equals(type)) {
			return new Dragonfly();
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else

		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
		}
		return null;
	}

}
