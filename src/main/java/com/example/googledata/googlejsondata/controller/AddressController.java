package com.example.googledata.googlejsondata.controller;

import com.example.googledata.googlejsondata.model.GeoJson;
import com.example.googledata.googlejsondata.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @Autowired
    RestTemplate restTemplate;

    @Value("${google.api.url}")
    private String apiURL;

    @Value("${api.key}")
    private String apiKey;

    @GetMapping("{location}")
    public GeoJson getLocationDetails(@PathVariable String location) {
        String dataURL=apiURL+"?key="+apiKey+"&address="+location;
        ResponseEntity<GeoJson> response =  restTemplate.getForEntity(dataURL,GeoJson.class);
        return response.getBody();
    }
}
