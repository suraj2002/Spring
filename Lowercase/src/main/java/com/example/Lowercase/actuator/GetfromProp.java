package com.example.Lowercase.actuator;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GetfromProp {
    @Value("${database.url}")
    private String DbURL;
    @PostConstruct
    public void jbjh(){
        System.out.println("DbURL: "+DbURL);
    }
}
