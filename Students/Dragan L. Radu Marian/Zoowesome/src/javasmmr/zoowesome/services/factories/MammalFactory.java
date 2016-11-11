package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.units.Constants;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if(Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else if(Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else
				throw new Exception("Invalid animal exception!");
	}
}
