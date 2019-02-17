package com.example.googledata.googlejsondata.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.ProtocolException;

@Service
public interface AddressService {

    public String getGoogleLocation(String location) throws ProtocolException, MalformedURLException;
}
