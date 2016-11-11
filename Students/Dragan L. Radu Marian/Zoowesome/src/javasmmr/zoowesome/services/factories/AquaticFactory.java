package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.units.Constants;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else if(Constants.Animals.Aquatics.Seal.equals(type)) {
			return new Seal();
		} else if(Constants.Animals.Aquatics.SeaHorse.equals(type)) {
			return new SeaHorse();
		} else
				throw new Exception("Invalid animal exception!");
	}
}
