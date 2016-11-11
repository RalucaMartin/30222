package services.factories;

import models.animals.Animal;
import java.util.*;
import models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type) {
		
		Random random = new Random();
		float normalBodytemp; 
		float percBodyHair; 
		
		if(Constants.Animals.Mammals.COW.equals(type)){
			
			normalBodytemp = random.nextInt(4)+ 35; //int 34- 39 ^C
			percBodyHair = random.nextInt(10)+ 90; // int 90-100
			float litersOfMilk = random.nextInt(4)+ 1; // int 1-4 l
			
			return new Cow(litersOfMilk, normalBodytemp, percBodyHair);
		} else if (Constants.Animals.Mammals.HORSE.equals(type)){
			
			normalBodytemp = random.nextInt(4)+ 35; //int 34- 39 ^C
			percBodyHair = random.nextInt(10)+ 90; // int 90-100
			
			return new Horse(random.nextBoolean(), normalBodytemp, percBodyHair);
			
		} else if (Constants.Animals.Mammals.LION.equals(type)){
			
			normalBodytemp = random.nextInt(4)+ 35; //int 34- 39 ^C
			percBodyHair = random.nextInt(10)+ 90; // int 90-100
			float weight = random.nextInt(20)+ 60; // int 60 - 80 kg
			
			return new Lion(weight, normalBodytemp, percBodyHair);
		} else return new Cow(3, 37, 90); //modificat
			
	}
}



