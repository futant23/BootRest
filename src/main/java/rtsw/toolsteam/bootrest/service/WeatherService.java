/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootrest.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rtsw.toolsteam.bootrest.domain.Current;

/**
 *
 * @author 
 */
@Service
public class WeatherService {
    
    private final static Logger log =LoggerFactory.getLogger(WeatherService.class);
    
    
    
    public WeatherService() {}
    
    public Current getCurrent(String location) {
        log.debug("getCurrent()");
        
        final String URL ="http://api.openweathermap.org/data/2.5/weather?q={location}&mode=xml";       
        RestTemplate restTemplate =new RestTemplate();
        Map<String, String> map =new HashMap<String, String>();
        map.put("location", location);
        
        Current current =restTemplate.getForObject(URL, Current.class, map);
        log.info("Located Current weather: "+ current);
        
        return current;
    }
}
