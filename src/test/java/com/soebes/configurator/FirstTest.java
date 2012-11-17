package com.soebes.configurator;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.testng.annotations.Test;

import com.soebes.configurator.jaxb.JAXBContextMarshallerSingleton;

public class FirstTest {

    @Test
    public void firstXmlTest() throws JAXBException {
	Project global = new Project("xproject");
	Environment environment_prod = new Environment("prod");
	
	Chunk chunk1 = new Chunk();
	chunk1.setId("Chunk1");
	environment_prod.addChunk(chunk1);
	Chunk chunk2 = new Chunk();
	chunk2.setId("Chunk2");
	environment_prod.addChunk(chunk2);
	
	global.addEnvironment(environment_prod);
	Environment environment_det = new Environment("det");
	global.addEnvironment(environment_det);

	Marshaller instance = JAXBContextMarshallerSingleton.getInstance();
	instance.marshal(global, System.out);
    }
    
    @Test
    public void readXmlTest() {
	
    }
}
