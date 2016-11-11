package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.units.Constants;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		} else if(Constants.Animals.Birds.Crow.equals(type)) {
			return new Crow();
		} else if(Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker();
		} else
				throw new Exception("Invalid animal exception!");
	}
}
