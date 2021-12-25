package com.example.gifmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GifMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GifMicroserviceApplication.class, args);
    }

}
