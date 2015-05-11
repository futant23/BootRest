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
@XmlRootElement(name ="sun")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sun {
    
    @XmlAttribute
    private String rise;
    
    @XmlAttribute
    private String set;
    
    public Sun() {}

    public Sun(String rise, String set) {
        this.rise = rise;
        this.set = set;
    }
    

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }
    
    
}
