package javasmmr.zoowsome.models.animals;
/**
 * pentru a initializa toate datele mostenite din clasa Animal, folosesc constructorul super()
 * constructorul unei clase abstracte se apeleaza de fiecare data cand instantiez  o clasa concreta
 * @author Cosmina
 *
 */
public abstract class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair; 
	
	public float getNormalBodyTemp(){
		return this.normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp  = normalBodyTemp;
	}
	
	public float getPercBodyHair(){
		return this.percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	public Mammal(){
		
	}

	
}
