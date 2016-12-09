package javasmmr.zoowsome.services.factories;
import java.util.Arrays;


public final class Constants {  
	
	 public static final String[] ANIMALS = {"Cow", "Tiger", "Tortoise", "Spider", "Butterfly", "Ant","Shark"};
	 public static final String[] EMPLOYEES = {"Ana", "Maria", "Marta", "Andreea", "Camelia", "Mihai", "Paul"};
	 public static final int[] WORKINGHOURS = {5, 8, 12, 3, 4, 6, 8};
	 

	 public static final class Species {   
		 public static final String MAMMALS = "MAMMALS";  
		 public static final String REPTILES = "REPTILES";   
		 public static final String BIRDS = "BIRDS";   
		 public static final String AQUATICS = "AQUATICS";   
		 public static final String INSECTS = "INSECTS";  
	 }
	 public static final class Animals {  
	  public static final class Mammals {    
		  public static final String TIGER = "TIGER";    
		  public static final String COW = "DOG";    
		  public static final String MONKEY = "MONKEY";   
	  }
	  public static final class Reptiles {    
		  public static final String TORTOISE = "TORTOISE";    
		  public static final String SNAKE = "SNAKE";    
		  public static final String CROCODILE = "CROCODILE";   
	  }
	  public static final class Birds {   
		  public static final String EAGLE = "EAGLE";    
		  public static final String CROW = "CROW";    
		  public static final String PARROT = "PARROT";  
	  }
	  public static final class Aquatics {    
		  public static final String WHALE = "WHALE";    
		  public static final String DOLPHIN = "DOLPHIN";    
		  public static final String SHARK = "SHARK"; 
	  }
	  public static final class Insects {    
		  public static final String ANT = "ANT";    
		  public static final String BUTTERFLY = "BUTTERFLY";    
		  public static final String SPIDER = "SPIDER"; 
	} 
	  
	 }
	  public static final class Employee{
		 public static final String CARETAKER = "CARETAKER";
		 public static final class Caretaker{
			  public static final String TCO_SUCCESS = "SUCCESS"; 
			  public static final String TCO_KILLED = "KILLED"; 
			  public static final String TCO_NO_TIME = "NO_TIME"; 
		  }
			
		  }
	 
}