package models.animals;

public class Snake extends Reptile{
	public Snake (String name, boolean laysEggs ){
		setName(name);
		setNrOfLegs(0);
		setLaysEggs(laysEggs);
		
	}
	
	public Snake (){
		this("Snake", true);
	}
	
}
