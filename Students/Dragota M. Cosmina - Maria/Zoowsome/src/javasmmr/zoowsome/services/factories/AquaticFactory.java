package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.DOLPHIN.equals(type)) {
			return new Dolphin(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.SALMON.equals(type)) {
			return new Salmon();
		} else if (Constants.Animals.Aquatics.WHALE.equals(type)) {
			return new Whale();
		} else {
			throw new Exception("Invalid animal exception");
		}
	}

}
