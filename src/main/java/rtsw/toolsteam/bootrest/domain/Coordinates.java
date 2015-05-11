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
@XmlRootElement(name ="coord")
@XmlAccessorType(XmlAccessType.FIELD)
public class Coordinates {
    
    @XmlAttribute
    private Double lat;
    
    @XmlAttribute
    private Double lon;

    public Coordinates() {}

    public Coordinates(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    
    
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
    
    
}
