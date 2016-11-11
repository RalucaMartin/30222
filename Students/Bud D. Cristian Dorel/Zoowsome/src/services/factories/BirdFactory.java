package services.factories;
import models.animals.Animal;
import models.animals.Ostrich;
import models.animals.Chicken;
import models.animals.Stork;

public class BirdFactory extends SpeciesFactory{
		
		public Animal getAnimal(String type) throws Exception{
			if(Constants.Animals.Bird.OSTRICH.equals(type)){
				return new Ostrich();
			} else if(Constants.Animals.Bird.CHICKEN.equals(type)){
				return new Chicken();
			} else if(Constants.Animals.Bird.STORK.equals(type)){
				return new Stork();
			} else {
				throw new Exception("Invalid animal expectiona!");
			}
		} 
}

