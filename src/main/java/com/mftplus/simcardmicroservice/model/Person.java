package com.mftplus.simcardmicroservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name = "personEntity")
@Table(name = "person_tbl")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String Name;

    @Column(name = "family")
    private String family;

    @Column(name = "national_id")
    @JsonProperty(value = "national_id")
    private String nationalId;

    @Column(name = "phone_number")
    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;
}
