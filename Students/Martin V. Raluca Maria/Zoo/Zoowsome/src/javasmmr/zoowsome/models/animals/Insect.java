package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.swing.text.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
public abstract class Insect extends Animal{
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
	private Boolean canFly;
	private Boolean isDangerous;
	
	public Boolean getCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}
	
	public Boolean getIsdangerous() {
		return this.isDangerous;
	}
	
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsdangerous()));
		
	}
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		
		
	}
}
