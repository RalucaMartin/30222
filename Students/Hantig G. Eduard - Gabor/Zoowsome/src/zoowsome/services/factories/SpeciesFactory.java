package zoowsome.services.factories;

import zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;
}
