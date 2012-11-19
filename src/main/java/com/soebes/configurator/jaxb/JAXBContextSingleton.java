package com.soebes.configurator.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

import com.soebes.configurator.General;

public class JAXBContextSingleton {

	private static final Logger LOGGER = Logger
			.getLogger(JAXBContextSingleton.class);

	private static JAXBContext jaxbContext;

	private static Marshaller createMarshaller() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(General.class);
		Marshaller m = jc.createMarshaller();

		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
		m.setProperty(Marshaller.JAXB_FRAGMENT, new Boolean(true));

		return m;
	}

	public static Marshaller getInstance() {
		Marshaller result = null;
		try {
			LOGGER.debug("Marshaller creation started.");
			result = createMarshaller();
			LOGGER.debug("Marshaller creation done.");
		} catch (JAXBException e) {
			LOGGER.error("JAXBException:", e);
		}
		return result;
	}

}
