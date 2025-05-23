package com.example.Lowercase.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthcheck implements HealthIndicator {
    @Override
    public Health health(){
        return Health.up().withDetail("Suraj","Lowercase").build();
    }

}
