package com.example.Lowercase.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "status")

public class StatusEndpoint {
    @ReadOperation
    public String myStatus() {
        return "Lghjygyujfutftfue";
    }

    @ReadOperation
    public String jhhj(@Selector String jhghjg){
        return "ghftyft";
    }

    @WriteOperation
    public String jhbcwejh(String Mob){
        return Mob;
    }
}
