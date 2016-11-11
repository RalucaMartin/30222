package avasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {

	public abstract Animal getAnimal(String type) throws Exception;
}
