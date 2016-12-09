package javasmmr.zoowsome.models.animals;

public interface Killer {
	public boolean kill();
	public double getPredisposition();
		 //why is it underlined? is it a mistake or 
		//we truly want a static method?
		// !! If static no override is possible => not static
} 
