package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.units.Constants;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.COCKROACH.equals(type)) {
			return new Cockroach();
		} else if(Constants.Animals.Insects.BEE.equals(type)) {
			return new Bee();
		} else if(Constants.Animals.Insects.BUTTERFLY.equals(type)) {
			return new Butterfly();
		} else
				throw new Exception("Invalid animal exception!");
	}
}
