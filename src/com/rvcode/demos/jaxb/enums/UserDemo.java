package com.rvcode.demos.jaxb.enums;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;


public class UserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Unmarshaller m = jaxbContext.createUnmarshaller();
			m.setEventHandler(new DefaultValidationEventHandler());
			File xml = new File("./src/User.xml");
			User u = (User)m.unmarshal(xml);
			System.out.println(u.acessMask.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
