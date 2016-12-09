package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	int avgSwimDepth;
	enum WaterType{SaltWater, FreshWater};
	WaterType waterType;
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public WaterType getWaterType() {
		return waterType;
	}
	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));   
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));  
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
