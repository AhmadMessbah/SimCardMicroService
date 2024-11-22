package com.mftplus.simcardmicroservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mftplus.simcardmicroservice.model.SimCard;

import java.util.List;

public interface SimCardService {
    void save(SimCard simCard) throws JsonProcessingException;
    void update(SimCard simCard);
    void delete(Long id);
    List<SimCard> findAll();
    SimCard findById(Long id);
}
