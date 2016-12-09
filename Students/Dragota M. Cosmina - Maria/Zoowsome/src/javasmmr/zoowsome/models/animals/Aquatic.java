package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	

	private int avgSwimDepth;
	public enum Water{ SALTWATER, FRESHWATER};
	/**
	 * Enums are classes  
	 * Instances of an enum are constants and should follow the conventions for constants. 
	 */
	private Water waterType;
	
	public int getAvgSwimDepth(){
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Water getWaterType(){
		return this.waterType;
	}
	
	public void setWaterType(Water waterType){
		this.waterType = waterType;
	}
	public Aquatic(){
		
	}

}
