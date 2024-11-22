package com.mftplus.simcardmicroservice.service.impl;

import com.mftplus.simcardmicroservice.model.Person;
import com.mftplus.simcardmicroservice.model.SimCard;
import com.mftplus.simcardmicroservice.service.PersonService;
import com.mftplus.simcardmicroservice.service.SimCardService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SimCardServiceImpl {
    private final SimcardRepository simcardRepository;
    private final PersonService personService;

    public SimCardServiceImpl(SimcardRepository simcardRepository, PersonService personService) {
        this.simcardRepository = simcardRepository;
        this.personService = personService;
    }

    @Transactional
    public void save(SimCard simCard){
        Person person =personService.postPerson(simCard.getPerson());
        System.out.println(person);
        simcardRepository.save(simCard);
    }
}
