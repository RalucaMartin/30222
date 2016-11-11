package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Pinguin;



public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Pinguin.equals(type)) {
			return new Pinguin(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl();
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
