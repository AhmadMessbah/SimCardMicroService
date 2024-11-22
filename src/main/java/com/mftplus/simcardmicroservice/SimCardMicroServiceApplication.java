package com.mftplus.simcardmicroservice;

import com.mftplus.simcardmicroservice.model.Person;
import com.mftplus.simcardmicroservice.model.SimCard;
import com.mftplus.simcardmicroservice.model.SimCardType;
import com.mftplus.simcardmicroservice.service.SimCardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimCardMicroServiceApplication {
    private static SimCardService service;

    public SimCardMicroServiceApplication(SimCardService service) {
        SimCardMicroServiceApplication.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimCardMicroServiceApplication.class, args);

        SimCard simCard =
                SimCard
                        .builder()
                        .person(Person.builder().name("ali").family("alipour").nationalId("1234567890").build())
                        .number("09178505323")
                        .simCardType(SimCardType.MCI)
                        .build();
        service.save(simCard);
    }

}
