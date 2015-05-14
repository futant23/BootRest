/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootrest.service;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rtsw.toolsteam.bootrest.domain.Current;

/**
 *
 * @author
 */
@Service
public class WeatherService {

    private final static Logger log = LoggerFactory.getLogger(WeatherService.class);

    @Value("${proxy.host}")
    private String proxyHost;

    @Value("${proxy.port}")
    private Integer proxyPort;

    @Value("${proxy.required}")
    private Boolean proxyRequired;

    public WeatherService() {
    }

    public Current getCurrent(String location) {
        log.debug("getCurrent()");

        final String URL = "http://api.openweathermap.org/data/2.5/weather?q={location}&mode=xml";

        RestTemplate restTemplate = getRestTemplate();
        Map<String, String> map = new HashMap<String, String>();
        map.put("location", location);

        Current current = restTemplate.getForObject(URL, Current.class, map);
        log.info("Located Current weather: " + current);

        return current;
    }

    private RestTemplate getRestTemplate() {

        
        if (proxyRequired) {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
            requestFactory.setProxy(proxy);

            return new RestTemplate(requestFactory);
        }
        else 
            return new RestTemplate();
    }

}
