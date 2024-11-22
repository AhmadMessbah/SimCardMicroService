package com.mftplus.simcardmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimCardMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimCardMicroServiceApplication.class, args);
    }

}
