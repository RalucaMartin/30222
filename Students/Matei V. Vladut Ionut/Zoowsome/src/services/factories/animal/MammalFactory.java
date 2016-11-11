package services.factories.animal;

import models.animals.*;

public class MammalFactory extends SpeciesFactory {
@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.COW.equals(type)) {
			return new Cow(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.TIGER.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.MONKEY.equals(type)) {
			return new Monkey();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}