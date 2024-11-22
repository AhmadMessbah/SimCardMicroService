package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="personService", url = "192.168.39.100")
public interface PersonService {

    @PostMapping("/person")
    ResponseEntity<String> postPerson(@RequestBody Person person) ;
}