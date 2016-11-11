package avasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} 
		else if (Constants.Animals.Birds.Crow.equals(type)) {
			return new Crow();
		} 
		else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
