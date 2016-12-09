package models.animals;

import static repositories.AnimalRepository.createNode;
import org.w3c.dom.Document;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Aquatic extends Animal {
	
	protected int avgSwimDepth;
	protected enum waterType  {saltWater, freshwater}
	
	public Aquatic(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		super.encodeToXml(eventWriter); 
 	 	createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));  	 	 
 	}
	
	public void decodeFromXml(Element element) {  	
		setAvgSwimDepth(Integer.valueOf(((Document) element).getElementsByTagName("avgSwimDepth").item(0).getTextContent()));  	
 		//setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent())); 
 	}
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwinDepth) {
		this.avgSwimDepth = avgSwinDepth;
	}
	
	
	
}
