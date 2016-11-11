package services.factories;
import models.animals.Animal;
import models.animals.Lizard;
import models.animals.Snake;
import models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory{
		
	   
		public Animal getAnimal(String type) throws Exception{
			if(Constants.Animals.Reptile.LIZARD.equals(type)){
				return new Lizard();
			} else if(Constants.Animals.Reptile.SNAKE.equals(type)){
				return new Snake();
			} else if(Constants.Animals.Reptile.TURTLE.equals(type)){
				return new Turtle();
			} else {
				throw new Exception("Invalid animal expectiona!");
			}
		} 
}
