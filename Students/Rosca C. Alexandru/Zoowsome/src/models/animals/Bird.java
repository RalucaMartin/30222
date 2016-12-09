package models.animals;

import static repositories.AnimalRepository.createNode;
import org.w3c.dom.Document;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Bird extends Animal{
	
	protected boolean migrate;
	protected int avgFlightAltitude;
	
	public Bird(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		super.encodeToXml(eventWriter); 
 	 	createNode(eventWriter, "migrate", String.valueOf(isMigrate()));  	 	
 	 	createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude())); 
 	}
	
	public void decodeFromXml(Element element) {  
		super.decodeFromXml(element);
		setMigrate(Boolean.valueOf(((Document) element).getElementsByTagName("migrate").item(0).getTextContent()));  	
		setAvgFlightAltitude(Integer.valueOf(((Document) element).getElementsByTagName("avgFlightAltitude").item(0).getTextContent())); 
 	}
	
	public boolean isMigrate() {
		return migrate;
	}
	public void setMigrate(boolean migrate) {
		this.migrate = migrate;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	

}
