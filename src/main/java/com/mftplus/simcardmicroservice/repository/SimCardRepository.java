package com.mftplus.simcardmicroservice.repository;

import com.mftplus.simcardmicroservice.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimCardRepository extends JpaRepository<SimCard, Long> {
    SimCard findByNumber(String number);
}
