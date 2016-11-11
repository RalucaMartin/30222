package models.animals;

public class Turtle extends Reptile{
	public Turtle (String name, boolean laysEggs ){
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(laysEggs);
		
	}
	
	public Turtle (){
		this("Turtle", true);
	}
	
}
