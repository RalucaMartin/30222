package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import org.w3c.dom.Document;
import javax.xml.stream.XMLStreamException;

public abstract class Mammal extends Animal {

	protected float normalBodytemp;
	protected float percBodyHair;
	
	
	public Mammal(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		super.encodeToXml(eventWriter); 
 	 	createNode(eventWriter, "normalBodytemp", String.valueOf(getNormalBodytemp()));  	 	
 	 	createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair())); 
 	}
	
	public void decodeFromXml(Element element) {  
		super.decodeFromXml(element);
		setNormalBodytemp(Float.valueOf(((Document) element).getElementsByTagName("normalBodytemp").item(0).getTextContent()));  	
		setPercBodyHair(Float.valueOf(((Document) element).getElementsByTagName("setPercBodyHair").item(0).getTextContent())); 
 	}
	
	public float getNormalBodytemp() {
		return normalBodytemp;
	}
	
	public void setNormalBodytemp(float normalBodytemp) {
		this.normalBodytemp = normalBodytemp;
	}
	
	public float getPercBodyHair() {
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	
}
