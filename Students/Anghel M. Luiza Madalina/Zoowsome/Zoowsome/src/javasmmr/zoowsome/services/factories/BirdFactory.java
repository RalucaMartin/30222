package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Flamingo;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		}else if (Constants.Animals.Birds.Flamingo.equals(type)) {
				return new Flamingo();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}