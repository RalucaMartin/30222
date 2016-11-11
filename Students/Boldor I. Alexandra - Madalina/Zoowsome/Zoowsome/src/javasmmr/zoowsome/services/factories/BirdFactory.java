package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
				return new Parrot(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Hawk.equals(type)) {
				return new Hawk();
		} else if (Constants.Animals.Birds.Stork.equals(type)) {
				return new Stork();
		} else {
				throw new Exception("Invalid animal exception!");	
		}
	}

}
