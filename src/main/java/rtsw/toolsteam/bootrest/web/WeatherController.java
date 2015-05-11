/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootrest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rtsw.toolsteam.bootrest.domain.Current;
import rtsw.toolsteam.bootrest.service.WeatherService;

/**
 *
 * @author 
 */
@RestController
public class WeatherController {
    
    private static final Logger log =LoggerFactory.getLogger(WeatherController.class);
    
    @Autowired
    private WeatherService service;
    
    
    /**
     * 
     * localhost:8080/api/weather?location=Texas
     * 
     * @param location
     * @return 
     */
   @RequestMapping(value ="/api/weather", method=RequestMethod.GET)
   public Current getCurrent(@RequestParam(required = true) String location) {
       log.info("getting current weather for location: "+location);
       return service.getCurrent(location);
   } 
   
}
