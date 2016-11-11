package javasmmr.zoowesome.models.animals;

public abstract class Animal {
	private Integer nrOfLegs = 0;
	private String name = "Universal";
	
	public void setNrOfLegs( int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

