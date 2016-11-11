package services.factories;

import models.animals.*;
import java.util.*;

public class BirdsFactory extends SpeciesFactory{
	
	Random random = new Random();
	int weight;
	
	boolean migrate;
	int avgFlightAlt;
	
	public Animal getAnimal(String type) {
		
		
		if(Constants.Animals.Birds.CROW.equals(type)){
			weight = random.nextInt(8) + 2; // interval 2 - 9 kg
			migrate = random.nextBoolean(); 
			avgFlightAlt = random.nextInt(40) + 10; //interval 10 - 50 m
			return new Crow(weight, migrate, avgFlightAlt);
			
			
		} else if (Constants.Animals.Birds.EAGLE.equals(type)){
			
			float wingSpred = random.nextInt(5) + 1; // interval 1 -5 m
			migrate = random.nextBoolean(); 
			avgFlightAlt = random.nextInt(1000) + 500; //interval 500 - 1500 m
			
			return new Eagle(wingSpred, migrate, avgFlightAlt);
			
		} else if (Constants.Animals.Birds.WOODPECKR.equals(type)){
			
			int noOfEggs = random.nextInt(3) + 2; // interval 2 - 5 eggs
			migrate = random.nextBoolean(); 
			avgFlightAlt = random.nextInt(40) + 10; //interval 10 - 50 m
			
			return new Woodpecker(noOfEggs, migrate, avgFlightAlt);
			
		} else return new Crow(7, false, 40); //default
	}
}
	

