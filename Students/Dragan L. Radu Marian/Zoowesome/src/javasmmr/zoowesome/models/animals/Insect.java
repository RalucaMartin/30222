package javasmmr.zoowesome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowesome.repositories.AnimalRepository;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		AnimalRepository.createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		AnimalRepository.createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}
	
	public Boolean getCanFly () {
		return canFly;
	}
	
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public Boolean getIsDangerous() {
		return isDangerous;
	}
}
