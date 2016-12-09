package javasmmr.zoowsome.services.factories.animalFactory;

import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);

}
