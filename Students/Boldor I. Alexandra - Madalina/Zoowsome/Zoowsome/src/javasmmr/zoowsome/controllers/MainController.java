package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Aquatics;
import javasmmr.zoowsome.services.factories.Constants.Animals.Birds;
import javasmmr.zoowsome.services.factories.Constants.Animals.Insects;
import javasmmr.zoowsome.services.factories.Constants.Animals.Mammals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Reptiles;
import javasmmr.zoowsome.services.factories.Constants.Employees.Caretakers;

public class MainController {
	public static void main(String[] args) throws Exception {
		int counter, i = -1;
		int nbOfAnimals = 15, nbOfCaretakers = 5;

		Animal[] a = new Animal[nbOfAnimals];
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);

		System.out.println("WELCOME TO THE ZOO!");
		Random random = new Random();

		while (i < nbOfAnimals - 1) {
			counter = random.nextInt(nbOfAnimals);
			switch (counter) {
			case 1:
				a[++i] = speciesFactory1.getAnimal(Mammals.Monkey);
				((Mammal) a[i]).getDetails();
				break;
			case 2:
				a[++i] = speciesFactory1.getAnimal(Mammals.Squirrel);
				((Mammal) a[i]).getDetails();
				break;
			case 3:
				a[++i] = speciesFactory1.getAnimal(Mammals.Tiger);
				((Mammal) a[i]).getDetails();
				break;
			case 4:
				a[++i] = speciesFactory2.getAnimal(Birds.Stork);
				((Bird) a[i]).getDetails();
				break;
			case 5:
				a[++i] = speciesFactory2.getAnimal(Birds.Parrot);
				((Bird) a[i]).getDetails();
				break;
			case 6:
				a[++i] = speciesFactory2.getAnimal(Birds.Hawk);
				((Bird) a[i]).getDetails();
				break;
			case 7:
				a[++i] = speciesFactory3.getAnimal(Insects.Bee);
				((Insect) a[i]).getDetails();
				break;
			case 8:
				a[++i] = speciesFactory3.getAnimal(Insects.Butterfly);
				((Insect) a[i]).getDetails();
				break;
			case 9:
				a[++i] = speciesFactory3.getAnimal(Insects.Spider);
				((Insect) a[i]).getDetails();
				break;
			case 10:
				i++;
				a[i] = speciesFactory4.getAnimal(Reptiles.Crocodile);
				((Reptile) a[i]).getDetails();
				break;
			case 11:
				a[++i] = speciesFactory4.getAnimal(Reptiles.Snake);
				((Reptile) a[i]).getDetails();
				break;
			case 12:
				a[++i] = speciesFactory4.getAnimal(Reptiles.Turtle);
				((Reptile) a[i]).getDetails();
				break;
			case 13:
				a[++i] = speciesFactory5.getAnimal(Aquatics.Jellyfish);
				((Aquatic) a[i]).getDetails();
				break;
			case 14:
				a[++i] = speciesFactory5.getAnimal(Aquatics.Octopus);
				((Aquatic) a[i]).getDetails();
				break;
			case 15:
				a[++i] = speciesFactory5.getAnimal(Aquatics.Carp);
				((Aquatic) a[i]).getDetails();
				break;
			default:
				System.out.println("The generated number is 0");

			}
		}

		/*
		 * CaretakerFactory caretakerFactory = new CaretakerFactory();
		 * 
		 * Employee[] caretakers = new Employee[nbOfCaretakers]; for(int j=0;
		 * j<nbOfCaretakers; j++) { caretakers[j] =
		 * caretakerFactory.getEmployeeFactory(Caretakers.CARETAKER); }
		 */ // empty constructor

		Employee[] caretakers = new Employee[] { new Caretaker("Sam", new BigDecimal(2000), false, 50.0),
				new Caretaker("David", new BigDecimal(5000), false, 10.0) };

		for (Employee c : caretakers) {
			for (Animal animal : a) {
				if (!(c.getIsDead()) && !(animal.getTakenCareOf())) {
					String result = ((Caretaker) c).takeCareOf(animal);
					if (result.equals(Caretakers.TCO_KILLED)) {
						c.setIsDead(true);
					} else if (result.equals(Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						animal.setTakenCareOf(true);
					}
				}

			}
		}

		for (Animal animal : a) {
			if (animal.getTakenCareOf()) {
				System.out.println("I'm " + animal.getName() + " and I have a caretaker");
			} else {
				System.out.println("Oh,no!I'm " + animal.getName() + " and nobody takes care of me");
			}
		}

		ArrayList<Animal> myList = new ArrayList<Animal>();
		for (Animal animal : a) {
			myList.add(animal);
		}

		AnimalRepository animalRep = new AnimalRepository();
		animalRep.save(myList);

		ArrayList<Animal> mySecList = new ArrayList<Animal>();
		mySecList = animalRep.load();

		for (int j = 0; j < mySecList.size(); j++) {
			System.out.println(mySecList.get(j).getName());
		}

	}
}
