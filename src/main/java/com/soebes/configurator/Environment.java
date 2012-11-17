package com.soebes.configurator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Environment {

    @XmlAttribute
    private String id;
    
    @XmlElementWrapper(name="chunks")
    @XmlElement(name="chunk")    
    private List<Chunk> chunks;

    public Environment() {
	this.chunks = new ArrayList<Chunk>();
    }
    public Environment(String id) {
	this();
	this.id = id;
    }
    
    public void addChunk(Chunk chunk) {
	this.chunks.add(chunk);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<Chunk> chunks) {
        this.chunks = chunks;
    }
    
}
