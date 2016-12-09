package models.animals;

import javax.lang.model.element.Element;
import org.w3c.dom.Document;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode; 

public abstract class Insect extends Animal{
	
	protected boolean canFly;
	protected boolean isDangerous;
	public boolean isCanFly() {
		return canFly;
	}
	
	public Insect(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	

 	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		super.encodeToXml(eventWriter); 
 	 	createNode(eventWriter, "canFly", String.valueOf(getCanFly()));  	 	
 	 	createNode(eventWriter, "isDangerous", String.valueOf(isDangerous())); 
 	} 

 	public void decodeFromXml(Element element) {  
 		super.decodeFromXml(element);
 		setCanFly(Boolean.valueOf(((Document) element).getElementsByTagName("canFly").item(0).getTextContent()));  	
 		setDangerous(Boolean.valueOf(((Document) element).getElementsByTagName("isDangerous").item(0).getTextContent())); 
 	}  
 	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean isDangerous() {
		return isDangerous;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	

}
