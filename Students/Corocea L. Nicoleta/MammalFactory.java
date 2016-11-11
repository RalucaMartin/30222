package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.utils.Constants;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Mammals.Donkey.equals(type)) {
			return new Donkey(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.Bear.equals(type)) {
			return new Bear();
		} else if (Constants.Animals.Mammals.Lion.equals(type)) {
			return new Lion();
		} else

		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
		}
		return null;
	}
}
