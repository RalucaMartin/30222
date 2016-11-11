package models.animals;

public class Cow extends Mammal{

	private float litersOfMilk;
	/*
	public Cow(){
		nrOfLegs = 4;
		name = "Cow";
		normalBodytemp = 35;
		percBodyHair = 95; 
		setLitersOfMilk(2);
	}
	*/
	
	public Cow(float litersOfMilk, float normalBodytemp, float percBodyHair){
		super(4,0.01);
		setNrOfLegs(4);
		setName("Cow");
		this.setLitersOfMilk(litersOfMilk);
		this.normalBodytemp = normalBodytemp;
		this.percBodyHair = percBodyHair;
	}

	public float getLitersOfMilk() {
		return litersOfMilk;
	}

	public void setLitersOfMilk(float litersOfMilk) {
		this.litersOfMilk = litersOfMilk;
	}
}
