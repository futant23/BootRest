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
@XmlRootElement(name ="temperature")
@XmlAccessorType(XmlAccessType.FIELD)
public class Temperature {
    
    @XmlAttribute
    private String value;
    
    @XmlAttribute
    private Double min;
    
    @XmlAttribute
    private Double max;
    
    @XmlAttribute
    private String unit;
    
    public Temperature() {}

    public Temperature(String value, double min, double max, String unit) {
        this.value = value;
        this.min = min;
        this.max = max;
        this.unit = unit;
    }
    

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    
}
