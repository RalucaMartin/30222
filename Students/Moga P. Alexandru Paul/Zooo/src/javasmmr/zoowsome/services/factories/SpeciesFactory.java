package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animal.Animal;



public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;
}
