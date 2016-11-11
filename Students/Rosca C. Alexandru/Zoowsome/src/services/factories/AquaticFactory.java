package services.factories;

import models.animals.*;
import java.util.*;

public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type) {
		
		Random random = new Random();
		int avgSwimDepth;
		
		if(Constants.Animals.Aquatics.FROG.equals(type)){
			
			avgSwimDepth = random.nextInt(3)+1 ; //1-3 m
			return new Frog(random.nextBoolean(), avgSwimDepth);
			
		} else if (Constants.Animals.Aquatics.SOMON.equals(type)){
			avgSwimDepth = random.nextInt(10)+ 10; // 10-20 m
			int migrationDist = random.nextInt(100)+200;  //100-300 km
			
			return new Somon(migrationDist, avgSwimDepth);
			
		} else if (Constants.Animals.Aquatics.TUNA.equals(type)){
			float lenght = random.nextInt(3)+ 1; //1-3 m
			avgSwimDepth = random.nextInt(50)+ 50; //50 - 100 m
			
			return new Tuna(lenght, avgSwimDepth);
		} else return new Frog(false, 2);  //default
	}
}

