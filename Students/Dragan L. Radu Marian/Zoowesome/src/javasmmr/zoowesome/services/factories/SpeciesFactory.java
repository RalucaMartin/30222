package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal( String type) throws Exception;
}

