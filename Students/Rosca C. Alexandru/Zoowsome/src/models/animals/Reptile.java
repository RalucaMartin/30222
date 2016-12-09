package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import org.w3c.dom.Document;
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal{
	protected boolean laysEggs;

	public Reptile(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		super.encodeToXml(eventWriter); 
 	 	createNode(eventWriter, "laysEggs", String.valueOf(isLaysEggs()));  	 	
 	} 
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setLaysEggs(Boolean.valueOf(((Document) element).getElementsByTagName("laysEggs").item(0).getTextContent()));  	
 	}
	
	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	

}
