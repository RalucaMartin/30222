package models.animals;

public abstract class Animal {
	private Integer nrOfLegs;
	private String name;
	
	public Integer getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(Integer a){
		this.nrOfLegs = a;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
