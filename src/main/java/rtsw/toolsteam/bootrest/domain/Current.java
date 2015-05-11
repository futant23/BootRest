/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootrest.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author  
 */
@XmlRootElement(name ="current")
@XmlAccessorType(XmlAccessType.FIELD)
public class Current {
    
    private City city;
    
    private Temperature temp;
    
    private Humidity humidity;
    
    private Pressure pressure;
    
    private Wind wind;
    
    private Clouds clouds;
    
    private Precipitation precip;
    
    private Weather weather;
    
    private LastUpdate lastupdate;
    
    public Current() {}

    public Current(City city, Temperature temp, Humidity humidity, Pressure pressure, Wind wind, Clouds clouds, Precipitation precip, Weather weather, LastUpdate lastupdate) {
        this.city = city;
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.clouds = clouds;
        this.precip = precip;
        this.weather = weather;
        this.lastupdate = lastupdate;
    }

    
    

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Precipitation getPrecip() {
        return precip;
    }

    public void setPrecip(Precipitation precip) {
        this.precip = precip;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public LastUpdate getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(LastUpdate lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        return "Current{" + "city=" + city + ", temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure + ", wind=" + wind + ", clouds=" + clouds + ", precip=" + precip + ", weather=" + weather + ", lastupdate=" + lastupdate + '}';
    }
 
    
}
