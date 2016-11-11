package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int noOfLegs;
	private String name;
	
	public int getNoOfLegs(){
		return this.noOfLegs;
	}
	
	public void setNoOfLegs(int noOfLegs){
		this.noOfLegs = noOfLegs;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	/**
	 * it is an abstract class – you cannot create any instance of it, however it can contain non-abstract methods and
	 *  can be extended
	 */
}
