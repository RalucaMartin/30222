package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;
import java.lang.reflect.Field;
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args)  { 
		
		/*for (Class clazz : Constants.Animals.class.getClasses()) {
			for (Field field : clazz.getDeclaredFields()) {
				try {
					System.out.println(field.get(clazz));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}*/
		
		 AnimalFactory abstractFactory1 = new AnimalFactory();  
		  SpeciesFactory speciesFactory1 = abstractFactory1.getSpeciesFactory(Constants.Species.MAMMALS);  
		  Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.COW);  
		  System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());  
		  
		  AnimalFactory abstractFactory2 = new AnimalFactory();  
		  SpeciesFactory speciesFactory2 = abstractFactory2.getSpeciesFactory(Constants.Species.MAMMALS);  
		  Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);  
		  System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs()); 
		  
		  
		  EmployeeAbstractFactory abstractFactory3 = new EmployeeAbstractFactory();
		  EmployeeFactory caretakerFactory = abstractFactory3.getEmployeeFactory(Constants.Employee.CARETAKER);
		  Employee c = caretakerFactory.getEmployee(Constants.Employee.Caretaker.TCO_SUCCESS);
		  System.out.printf("Employee name is %s with id %d ", c.getName(),c.getId());
		  
		  
		  
		  Employee[] caretakers;
		  Animal[] animals = new Animal[7];

		  for (Employee caretaker : caretakers) {
			  ((Caretaker) caretaker).takeCareOf(animals[]);
			  {

	}
}
	}
}












		 /* int numberOfAnimals = 50, i, numberOfSpecies = 5, numberOfTypes = 15;
	

		 String randomSpecies = "Bird Insect Mammal Reptile Aquatic";
		 String randomTypes = "Ant Butterfly Cow Crocodile Crow Dolphin Eagle Monkey Parrot Shark Snake Spider Tiger Tortoise Whale";
		  
		  String[] wordsAsArray1 = randomSpecies.split(" ");
		  String[] wordsAsArray2 = randomTypes.split(" ");
		  
		  
		  for(i = 0; i < numberOfAnimals; i++){
			  
			  int index1 = new Random().nextInt(wordsAsArray1.length);
			  int index2 = new Random().nextInt(wordsAsArray2.length);

			  String randomWord1 = wordsAsArray1[index1];
			  String randomWord2 = wordsAsArray2[index2];
			  
//			  SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.randomWord1);
//		      Animal a2 = speciesFactory2.getAnimal(Constants.Animals.randomWord1.randomWord2);
//		      System.out.printf("Our animal's name is:", a2.getName());
		      System.out.println("And it has %d legs!\n", a2.getNrOfLegs()); 
		      
		  }
		  
		  
		  
		 } */

