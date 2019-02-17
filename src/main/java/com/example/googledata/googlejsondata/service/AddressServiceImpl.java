package com.example.googledata.googlejsondata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.ProtocolException;

@Component
public class AddressServiceImpl implements AddressService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${google.api.url}")
    private String apiURL;

    @Value("${api.key}")
    private String apiKey;

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

    @Override
    public String getGoogleLocation(String location) throws ProtocolException, MalformedURLException {

        String dataURL=apiURL+"?key="+apiKey+"&address="+location;
        System.out.println("URL  ===> "+dataURL);
        ResponseEntity<String> response =  restTemplate.getForEntity(dataURL,String.class);
        System.out.println("Response:::"+response.getBody());
        return "Success";
    }
}
