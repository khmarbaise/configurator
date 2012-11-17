package com.soebes.configurator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Project {

    @XmlAttribute
    private String id;

    @XmlElementWrapper(name="environments")
    @XmlElement(name="environment")    
    private List<Environment> environments;
    
    public Project() {
	this.environments = new ArrayList<Environment>();
    }

    public Project(String id) {
	this();
	this.id = id;
    }

    public void addEnvironment(Environment environment) {
	this.environments.add(environment);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }
    
}
