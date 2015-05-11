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
@XmlRootElement(name = "direction")
@XmlAccessorType(XmlAccessType.FIELD)
public class Direction {

    @XmlAttribute
    private Double value;

    @XmlAttribute
    private String code;

    @XmlAttribute
    private String name;

    public Direction() {
    }

    public Direction(Double value, String code, String name) {
        this.value = value;
        this.code = code;
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
