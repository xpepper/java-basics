package it.xpeppers.learn.xml;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SimpleXmlParsing {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        URL url = new URL("http://www.xmlfiles.com/examples/cd_catalog.xml");
        Document document = documentBuilder.parse(url.openStream());
        NodeList nodeList = document.getElementsByTagName("TITLE");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.err.println(node.getNodeName() + ": " + node.getTextContent());
        }

    }
}
