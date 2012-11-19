package com.soebes.configurator.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

import com.soebes.configurator.General;

public final class JAXBContextMarshallerSingleton {

    private static final Logger LOGGER = Logger.getLogger(JAXBContextMarshallerSingleton.class);

    private JAXBContextMarshallerSingleton() {
    }

    private static Marshaller createMarshaller() throws JAXBException {
	JAXBContext jc = JAXBContext.newInstance(General.class);
	Marshaller m = jc.createMarshaller();

	m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
	m.setProperty(Marshaller.JAXB_FRAGMENT, new Boolean(false));
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

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
