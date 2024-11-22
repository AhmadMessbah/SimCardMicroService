package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.SimCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SimCardService {
    void save(SimCard simCard);
    void update(SimCard simCard);
    void delete(SimCard simCard);
    List<SimCard> findAll();
    SimCard findById(Long id);
}
