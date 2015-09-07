package org.example.xml;

import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.example.demo.AddressType;
import org.example.demo.PersonType;

public class JaxbDemo {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(PersonType.class);

			System.out.println("XML --> Java");
			Unmarshaller u = context.createUnmarshaller();
			PersonType person = (PersonType) u.unmarshal(new FileInputStream(FilenameConstants.XML));

			System.out.println(person.getName());
			System.out.println(person.getAddress().getNumber());
			System.out.println(person.getAddress().getStreet());

			System.out.println("Java --> XML");
			Marshaller m = context.createMarshaller();

			AddressType a = new AddressType();
			a.setNumber(100);
			a.setStreet("Sanayi Mahallesi");

			PersonType p = new PersonType();
			p.setName("Bilginc");
			p.setAddress(a);

			System.out.println("UNFORMATTED");
			m.marshal(p, System.out);

			System.out.println();
			System.out.println("FORMATTED");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(p, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
