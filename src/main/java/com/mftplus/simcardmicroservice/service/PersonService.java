package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value="personClient", url = "http://192.168.39.38")
public interface PersonService {

    @PostMapping("/persons")
    Person postPerson(@RequestBody Person person) ;
}
