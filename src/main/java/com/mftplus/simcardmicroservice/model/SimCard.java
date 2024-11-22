package com.mftplus.simcardmicroservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name = "simcardEntity")
@Table(name = "simcard_tbl")
public class SimCard {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "number")
    @Pattern(regexp = "^(09|\\+989)\\d{9}$", message = "Invalid Phone Number")
    private String number;

    @Column(name = "type")
    private SimCardType simCardType;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "person",
            foreignKey = @ForeignKey(name = "fk_person_id")
    )
    private Person person;
}
