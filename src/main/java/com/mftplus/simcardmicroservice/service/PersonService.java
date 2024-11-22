package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name="personClient", url = "192.168.39.100")
public interface PersonService {

    @PostMapping("/person")
    ResponseEntity<String> postPerson(@RequestBody Person person) ;
}
