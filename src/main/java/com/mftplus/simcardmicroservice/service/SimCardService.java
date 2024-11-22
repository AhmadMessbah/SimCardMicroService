package com.mftplus.simcardmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimCardService {
    @Autowired
    private final PersonService personService;

    public SimCardService(PersonService personService) {
        this.personService = personService;
    }
}
