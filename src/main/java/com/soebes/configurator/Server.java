package com.soebes.configurator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

    @XmlAttribute
    private String id;

    public Server() {
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

}
