package javasmmr.zoowsome.repositories;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EnElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLEventFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		//Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		//Create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		//Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for( XML_Parsable animal : animals ) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
			
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException{
		ArrayList<Animal> animals = new ArrayList<Animal>();
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
				switch(discriminant) {
				case Constants.Animal.Insect.Butterfly :
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
				case Constants.Animal.Insect.Cockroach :
					Animal cockroach = new Cockroach();
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
				case Constants.Animal.Insect.Spider :
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
				case Constants.Animal.Aquatic.Dolphin :
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
				case Constants.Animal.Aquatic.Shark :
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shake);
				case Constants.Animal.Aquatic.Octopus :
					Animal octopus = new Butterfly();
					octopus.decodeFromXml(element);
					animals.add(octopus);
				case Constants.Animal.Bird.Flamingo :
					Animal flamingo = new Flamingo();
					flamingo.decodeFromXml(element);
					animals.add(flamingo);
				case Constants.Animal.Bird.Gull :
					Animal gull = new Gull();
					gull.decodeFromXml(element);
					animals.add(gull);
				case Constants.Animal.Bird.Turacos :
					Animal turacos = new Turacos();
					turacos.decodeFromXml(element);
					animals.add(turacos);
				case Constants.Animal.Mammal.Cow :
					Animal cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
				case Constants.Animal.Mammal.Monkey :
					Animal monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
				case Constants.Animal.Bird.Tiger :
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
				case Constants.Animal.Reptile.Snake :
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
				case Constants.Animal.Reptile.Lizzard :
					Animal lizzard = new Lizzard();
					lizzard.decodeFromXml(element);
					animals.add(lizzard);
				case Constants.Animal.Reptile.Crocodile :
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);				
				default:break;
				}
			}
		}
		return animals;
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name,String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		//Create Start node
		StartElement sElement = eventFactory.cretateStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		//Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		//Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
				
	}
	
	
}
