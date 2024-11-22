package com.mftplus.simcardmicroservice.repository;

import com.mftplus.simcardmicroservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    boolean existsPersonByUsername(String username);
    Person findByUsername(String username);
    Person findByPhoneNumber(String phoneNumber);
    Optional<Person> findByUsernameAndPassword(String username, String password);
}
