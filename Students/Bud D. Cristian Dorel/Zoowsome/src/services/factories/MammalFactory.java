package services.factories;
import models.animals.Animal;
import models.animals.Cow;
import models.animals.Monkey;
import models.animals.Tiger;

public class MammalFactory extends SpeciesFactory{
		
	   
		public Animal getAnimal(String type) throws Exception{
			if(Constants.Animals.Mammal.COW.equals(type)){
				return new Cow();
			} else if(Constants.Animals.Mammal.MONKEY.equals(type)){
				return new Monkey();
			} else if(Constants.Animals.Mammal.TIGER.equals(type)){
				return new Tiger();
			} else {
				throw new Exception("Invalid animal expectiona!");
			}
		} 
}