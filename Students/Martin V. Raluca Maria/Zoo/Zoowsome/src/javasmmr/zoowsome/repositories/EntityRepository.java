package javasmmr.zoowsome.repositories;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public abstract class EntityRepository<T extends XML_Parsable> {
	private final String xmlFilename;
	private final String entityTag;
	
	public EntityRepository(String xmlFilename, String entityTag) {
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}
	
	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException{
		 XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		 XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));
		 XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		 XMLEvent end = eventFactory.createDTD("\n");
		 
		 StartDocument startDocument = eventFactory.createStartDocument();
		 eventWriter.add(startDocument);
		 
		 StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		 eventWriter.add(configStartElement);
		 eventWriter.add(end);
		 
		 for (XML_Parsable entity: entities){
			 StartElement sElement = eventFactory.createStartElement("", "", this.entityTag);
		     eventWriter.add(sElement);
		     eventWriter.add(end);
		     animal.encodeToXml(eventWriter);
		     EndElement eElement = eventFactory.createEndElement("", "", this.entityTag);
		     eventWriter.add(eElement);
		     eventWriter.add(end);
		 }
		 eventWriter.add(eventFactory.createEndElement("", "", "content"));
		 eventWriter.add(eventFactory.createEndDocument());
		 eventWriter.close();
	}
	
	public ArrayList<T> load() throws ParserConfigurationException, SAXException, IOException{
		ArrayList<T> entities = new ArrayList<T>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementByTagName(Constants.XML_TAGS.ANIMAL);
		for( int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if ( node.getNodeType() == Node.ELEMENT_NODE ) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS>DISCRIMINANT).item(0).getTextContent();
				
			}
			for( int i = 0; i < nodeList.getLength(); i++ ) {
				Node node = nodeList.item(i);
				if( node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					entities.add(getEntityFromXmlELement(element));
				}
			}
		}
		return animals;
	}
	
	protected abstract T getEntityFromXmlElement(Element element);

	
	

}