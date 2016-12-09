package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.repositories.AnimalRepository;

import javax.swing.text.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
public abstract class Aquatic extends Animal {

	
	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private int avgSwimDepth;
	private enum waterType {
		ocean, sea, lake, river
	}
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth( int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));	
	}
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));	
	}
}
