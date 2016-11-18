package zoowsome.services.factories;

import zoowsome.models.animals.Animal;
import zoowsome.models.animals.Cow;
import zoowsome.models.animals.Monkey;
import zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

		public Animal getAnimal(String type) throws Exception{
			if (Constants.Animals.Mammal.COW.equals(type)) {
				return new Cow();
			} else if(Constants.Animals.Mammal.MONKEY.equals(type)) {
				return new Monkey();
			} else if(Constants.Animals.Mammal.TIGER.equals(type)) {
				return new Tiger();
			} else {
				throw new Exception("Invalid animal exception!");
			}
		}
}
