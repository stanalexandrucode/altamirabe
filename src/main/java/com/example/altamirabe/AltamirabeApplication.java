package com.example.altamirabe;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Altamira", version = "3.0", description = "Homework"))
public class AltamirabeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AltamirabeApplication.class, args);
    }

}
