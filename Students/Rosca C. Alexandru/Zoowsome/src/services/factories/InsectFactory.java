package services.factories;

import models.animals.*;
import java.util.*;

public class InsectFactory extends SpeciesFactory{
	public Animal getAnimal(String type) {
		
		Random random = new Random();
		
		if(Constants.Animals.Insects.ANT.equals(type)){
			
			int lvlPainBite = random.nextInt(10)+ 1; //1-10
			return new Ant(lvlPainBite, random.nextBoolean(), random.nextBoolean());
			
		} else if (Constants.Animals.Insects.FLY.equals(type)){
			
			int lifeTime = random.nextInt(5)+ 5; //5-10
		return new Fly(lifeTime, random.nextBoolean(), random.nextBoolean());
		
		} else if (Constants.Animals.Insects.MOSQUITO.equals(type)){
			
			return new Mosquito(random.nextBoolean(), random.nextBoolean(), random.nextBoolean());
		} else return new Ant(5, false, true); //modificat !!!
}
	
}
