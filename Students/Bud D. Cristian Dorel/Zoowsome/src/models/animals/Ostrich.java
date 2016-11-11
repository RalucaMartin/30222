package models.animals;

public class Ostrich extends Bird {
	
		private enum OstrichType{
			masai, arabian, somali
		}
		
		private OstrichType ostrichType;
		
		public OstrichType getOstrichType(){
			return this.ostrichType;
		}
		
		public void setOstrichType(OstrichType ostrichType){
			this.ostrichType = ostrichType;
		}
		
		public Ostrich (String name, boolean migrates, Integer avgFlightAltitude){
			setName(name);
			setNrOfLegs(2);
			setMigrates(migrates);
			setAvgFlightAltitude(avgFlightAltitude);
			
		}
		
		public Ostrich(){
			this("Ostrich", false, 0);
		}
}
