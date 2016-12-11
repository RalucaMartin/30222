package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException; 

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode; 

public abstract class Insect extends Animal{
	boolean canFly;
	boolean isDangerous;
	
	public boolean getCanFly() {
		return this.canFly;	
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean getIsDangerous() {
		return this.isDangerous;	
	}
	
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
		super.encodeToXml(eventWriter); 
	 	createNode(eventWriter, "canFly", String.valueOf(getCanFly()));  	 	
	 	createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous())); 
	} 
	
	public void decodeFromXml(Element element) {  	
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));  	
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent())); 
		}  

}

