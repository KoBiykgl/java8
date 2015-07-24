package org.example.xml;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltDemo {

	public static void main(String[] args) {
		try {
			TransformerFactory factory = TransformerFactory.newInstance();
			Source xslt = new StreamSource(new File(FilenameConstants.XSL));
			Transformer transformer = factory.newTransformer(xslt);

			Source text = new StreamSource(new File(FilenameConstants.XML));
			transformer.transform(text, new StreamResult(new File(
					FilenameConstants.HTML)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
