/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootrest.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author  
 */
@XmlRootElement(name = "clouds")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clouds {
    
    @XmlAttribute
    private Double value;
    
    @XmlAttribute
    private String name;

    public Clouds() {}

    public Clouds(Double value, String name) {
        this.value = value;
        this.name = name;
    }
    
    
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
