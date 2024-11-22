package com.mftplus.simcardmicroservice.service.impl;

import com.mftplus.simcardmicroservice.model.Person;
import com.mftplus.simcardmicroservice.model.SimCard;
import com.mftplus.simcardmicroservice.repository.PersonRepository;
import com.mftplus.simcardmicroservice.repository.SimCardRepository;
import com.mftplus.simcardmicroservice.service.PersonService;
import com.mftplus.simcardmicroservice.service.SimCardService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimCardServiceImpl implements SimCardService {
    private final SimCardRepository simcardRepository;
    private final PersonRepository personRepository;
    private final PersonService personService;

    public SimCardServiceImpl(SimCardRepository simcardRepository, PersonRepository personRepository, PersonService personService) {
        this.simcardRepository = simcardRepository;
        this.personRepository = personRepository;
        this.personService = personService;
    }

    @Transactional
    public void save(SimCard simCard) {
        ResponseEntity<String> response = personService.postPerson(simCard.getPerson());
        if (response.getStatusCode().equals(HttpStatus.OK)) {
//            personRepository.save(person);
//            simCard.setPerson(person);
//            simcardRepository.save(simCard);
            System.out.println(response.getBody());
        } else {
            System.out.println("Error :" + response.getStatusCode() + " : " + response.getBody());
        }
    }

    @Override
    public void update(SimCard simCard) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<SimCard> findAll() {
        return List.of();
    }

    @Override
    public SimCard findById(Long id) {
        return null;
    }
}
