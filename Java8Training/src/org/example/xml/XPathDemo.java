package org.example.xml;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class XPathDemo {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory builderFact = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = builderFact.newDocumentBuilder();
			Document document = builder.parse(new FileInputStream(
					FilenameConstants.XML));

			XPath xPath = XPathFactory.newInstance().newXPath();

			String nameExp = "/Person/Name";
			String streetExp = "/Person/Address[Number='19231']/Street";

			String name = xPath.compile(nameExp).evaluate(document);
			String street = xPath.compile(streetExp).evaluate(document);

			System.out.println("name: " + name);
			System.out.println("street: " + street);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
