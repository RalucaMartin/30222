package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.KomodoDragon.equals(type)) {
			return new KomodoDragon();
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
