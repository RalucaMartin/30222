package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Frog;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.DOLPHIN.equals(type)) {
			return new Dolphin(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.FROG.equals(type)) {
			return new Frog();
		} else if (Constants.Animals.Aquatics.WHALE.equals(type)) {
			return new Whale();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}