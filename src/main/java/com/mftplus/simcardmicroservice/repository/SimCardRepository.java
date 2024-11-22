package com.mftplus.simcardmicroservice.repository;

import com.mftplus.simcardmicroservice.model.Person;
import com.mftplus.simcardmicroservice.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SimCardRepository extends JpaRepository<SimCard, Long> {
    SimCard findByPhoneNumber(String phoneNumber);
}
