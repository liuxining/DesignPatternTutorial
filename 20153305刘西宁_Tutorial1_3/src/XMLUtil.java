import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtil {
	public static Object getBean(String args){
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/config.xml"));
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");
			if(args.equals("color")){
				classNode = nl.item(0).getFirstChild();
			}
			else if(args.equals("pen")){
				classNode = nl.item(1).getFirstChild();
			}
			cName = classNode.getNodeValue();
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
