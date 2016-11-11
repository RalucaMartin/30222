package zoowsome.controllers;

import zoowsome.models.animals.Animal;
import zoowsome.services.factories.AnimalFactory;
import zoowsome.services.factories.Constants;
import zoowsome.services.factories.SpeciesFactory;
import java.util.Random;

public class MainController {
	public static void main(String[] args) throws Exception {
		
		final String constantSpecies[] = {	Constants.Species.AQUATIC, 
											Constants.Species.BIRD,
											Constants.Species.INSECT,    // Speciile de animal
											Constants.Species.MAMMAL,
											Constants.Species.REPTILE };
	
		final String constantAnimals[][] = {
			{ Constants.Animals.Aquatic.FROG, Constants.Animals.Aquatic.SHARK, Constants.Animals.Aquatic.WHALE },
			{ Constants.Animals.Bird.COLIBRI, Constants.Animals.Bird.OSTRICH, Constants.Animals.Bird.SWAN },
			{ Constants.Animals.Insect.BUTTERFLY, Constants.Animals.Insect.COCKROACH, Constants.Animals.Insect.SPIDER },
			{ Constants.Animals.Mammal.COW, Constants.Animals.Mammal.MONKEY, Constants.Animals.Mammal.TIGER },
			{ Constants.Animals.Reptile.ALLIGATOR, Constants.Animals.Reptile.LIZZARD, Constants.Animals.Reptile.SNAKE }
		};

		// Tipurile de animal
		
		AnimalFactory abstractFactory = new AnimalFactory();		// Crearea fabricii de animale
		Random random = new Random();		// Pentru Randomizarea speciilor si tipurilor de animale.
		final int COUNTER = 50; 		// Counter-ul care poate fi setat la oricec valoare
		Animal animal[] = new Animal[COUNTER];		// Crearea celor 50 de obiecte reprezentate de animale
	
		for(int i = 0; i < COUNTER; i++) {
			int index = random.nextInt(constantSpecies.length);
			SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(constantSpecies[index]);
			animal[i] = speciesFactory.getAnimal(constantAnimals[index][random.nextInt(constantAnimals[index].length)]);
		}
		
		// Afisarea celor 50 de animale create
		for(int i = 0; i< 50; i++) {
			System.out.printf("Animal nr %d: %s\n", i+1, animal[i].getName()); 
		}		
	}
}

