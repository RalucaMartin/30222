package javasmmr.zoowesome.services.factories;

import javasmmr.zoowesome.models.animals.*;
import javasmmr.zoowesome.units.Constants;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.TIGER.equals(type)) {
			return new Tiger();
		} else if(Constants.Animals.Mammals.MONKEY.equals(type)) {
			return new Monkey();
		} else if(Constants.Animals.Mammals.COW.equals(type)) {
			return new Cow();
		} else {
				throw new Exception("Invalid animal exception!");
		}
	}
}
