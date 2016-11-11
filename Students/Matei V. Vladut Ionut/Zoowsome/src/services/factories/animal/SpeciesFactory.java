package services.factories.animal;

import models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;
}
