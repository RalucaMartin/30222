package zoowsome.services.factories;

import zoowsome.models.animals.Animal;
import zoowsome.models.animals.Butterfly;
import zoowsome.models.animals.Cockroach;
import zoowsome.models.animals.Spider;


public class InsectFactory extends SpeciesFactory {

		public Animal getAnimal(String type) throws Exception{
			if (Constants.Animals.Insect.BUTTERFLY.equals(type)) {
				return new Butterfly();
			} else if(Constants.Animals.Insect.COCKROACH.equals(type)) {
				return new Cockroach();
			} else if(Constants.Animals.Insect.SPIDER.equals(type)) {
				return new Spider();
			} else {
				throw new Exception("Invalid animal exception!");
			}
		}
}
