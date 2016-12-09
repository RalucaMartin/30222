package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Birds.VULTURE.equals(type)) {
			return new Vulture(); // leave empty constructor, for now!
		} 
		else if (Constants.Animals.Birds.SWAN.equals(type)) {
			return new Swan();
		} 
		else if (Constants.Animals.Birds.OWL.equals(type)) {
			return new Owl();
		} 
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
