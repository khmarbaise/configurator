package com.soebes.configurator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Chunk {

    @XmlAttribute
    private String id;

    @XmlElementWrapper(name="servers")
    @XmlElement(name="server")    
    private List<Server> servers;

    public Chunk() {
	this.servers = new ArrayList<Server>();
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public List<Server> getServers() {
	return servers;
    }

    public void setServers(List<Server> servers) {
	this.servers = servers;
    }

}
