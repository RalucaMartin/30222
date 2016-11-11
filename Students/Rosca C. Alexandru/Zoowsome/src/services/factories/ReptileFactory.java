package services.factories;

import models.animals.*;
import java.util.*;

public class ReptileFactory extends SpeciesFactory{

	public Animal getAnimal(String type) {
		
		Random random = new Random();
		boolean laysEggs;
		
		if(Constants.Animals.Reptiles.CROCODILE.equals(type)){
			
			laysEggs = random.nextBoolean();
			int lenght = random.nextInt(10) + 1 ; //interval 1- 10 m
		
			return new Crocodile(lenght, laysEggs);
			
		} else if (Constants.Animals.Reptiles.LIZZARD.equals(type)){
			
			laysEggs = random.nextBoolean();
			int color = random.nextInt(255); 
			
			return new Lizzard(color, laysEggs);
		} else if (Constants.Animals.Reptiles.SNAKE.equals(type)){
			
			return new Snake(random.nextBoolean(), random.nextBoolean());
		} else return new Snake(true, true);  //default
	}
}
