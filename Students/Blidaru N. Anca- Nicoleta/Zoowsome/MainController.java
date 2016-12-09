package javasmmr.zoowsome.controllers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        
		int newAnimal;
		Animal[] animal = new Animal[Constants.ZOO_DIMENSION];
		Random random = new Random();

		for (int i = 0; i < Constants.ZOO_DIMENSION; i++) {

			newAnimal = random.nextInt(Constants.NR_OF_ANIMALS);

			switch (newAnimal) {

			case 0:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs\n",
						animal[i].getNrOfLegs());
				break;

			case 1:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 2:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.COW);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 3:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.LIZZARD);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 4:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.KOMODODRAGON);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 5:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.SNAKE);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 6:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.VULTURE);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 7:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.SWAN);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 8:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.OWL);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 9:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.SHARK);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 10:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.OCTOPUS);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 11:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.FISH);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 12:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.BUTTERFLY);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 13:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.COCKROACH);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 14:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.SPIDER);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			}
		}
		


		/* for(int i = 0; i <= Constants.ZOO_DIMENSION; i++){
			 for(Class clazz : Constants.Animals.class.getClasses()) {     
				 for (Field field : clazz.getDeclaredFields()) {
					 
					 try {
						 //animal[i] = (Animal) field.get(clazz);
			       		 System.out.println(field.get(clazz));
			         }
			         	catch(Exception e) {
			         		e.printStackTrace();
			         	}
			     }
			}
		}
		*/
			 
		// Zoowsome second part

		EmployeeAbstractFactory abstractEmployeeFactory = new EmployeeAbstractFactory();
		EmployeeFactory employeeFactory = abstractEmployeeFactory
				.getEmployeeFactory(Constants.Employees.Caretakers.CARETAKER);
		Caretaker[] caretaker = new Caretaker[Constants.NR_OF_CARETAKERS];

		for (int i = 0; i < Constants.NR_OF_CARETAKERS; i++) {
			caretaker[i] = (Caretaker) employeeFactory.getEmployee(Constants.Employees.Caretakers.CARETAKER);

		}

		String result;
		for (int i = 0; i < Constants.NR_OF_CARETAKERS; i++) {
			for (int j = 0; j < Constants.NR_OF_ANIMALS; j++) {
				if ((!caretaker[i].getIsDead()) && (!animal[j].getTakenCareOf())) {
					result = caretaker[i].takeCareOf(animal[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						break;
					} else {
						animal[j].setTakenCareOf(true);
					}
				}
			}
		}

		System.out.println("*****************************************************************************************************");

		// when I go throw all the list of animals, only random animals are being verified, not all of them

		for (int i = 0; i < Constants.NR_OF_ANIMALS; i++) {
			if (animal[i].getTakenCareOf() == true) {
				System.out.println(animal[i].getName() + " has been taken care of");
			} 
			else {
				System.out.println(animal[i].getName() + " hasn't been taken care of");
			}
		}

		// Zoowsome third part
		
		System.out.println("*****************************************************************************************************");

		AnimalRepository animalRepository = new AnimalRepository();
		ArrayList<Animal> animals = new ArrayList<Animal>();
	
		for (int i = 0; i < Constants.NR_OF_ANIMALS; i++) {
			animals.add(animal[i]);
		}

		animalRepository.save(animals);                        //saving my array list of animals to an xml file
		
		animals = animalRepository.load();                     //loading my array list of animals from the same xml file
		
		System.out.println("My array list of animals loaded from the XML file: ");
		for (int i = 0; i < Constants.NR_OF_ANIMALS; i++) {    
			System.out.println(animals.get(i).getName());
		}


	}
}
