package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.SimCard;

import java.util.List;

public interface SimCardService {
    void save(SimCard simCard);
    void update(SimCard simCard);
    void delete(Long id);
    List<SimCard> findAll();
    SimCard findById(Long id);
}
