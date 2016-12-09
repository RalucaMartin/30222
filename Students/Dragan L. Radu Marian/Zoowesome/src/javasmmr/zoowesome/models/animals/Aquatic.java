package javasmmr.zoowesome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowesome.repositories.AnimalRepository;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	public enum WaterType {SALTWATER, FRESHWATER};
	private WaterType waterType;
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		AnimalRepository.createNode(eventWriter, "avgSweimDepth", String.valueOf(getAvgSwimDepth()));
		AnimalRepository.createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		//Even if I imported the javasmmr.zoowesome.repositories.AnimalRepository I have to write
		//AnimalRepository.createNode(...) not only createNode(...).
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		// Up here if i change from Boolean to integer I have to change it in the Animal class which is not good for the insect class
		
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}
	
	
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setWaterType (WaterType waterType) {
		this.waterType = waterType;
	}
	
	public WaterType getWaterType() {
		return waterType;
	}
	
}
