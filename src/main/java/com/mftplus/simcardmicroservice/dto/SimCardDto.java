package com.mftplus.simcardmicroservice.dto;

import com.mftplus.simcardmicroservice.model.Person;
import com.mftplus.simcardmicroservice.model.SimCard;
import com.mftplus.simcardmicroservice.model.SimCardType;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Component
public class SimCardDto {
    private String name;
    private String family;
    private String nationalId;
    private String number;
    private SimCardType simCardType;

    public Person getPerson(){
        return Person.builder().name(name).family(family).nationalId(nationalId).build();
    }

    public SimCard getSimCard(){
        return SimCard.builder().person(getPerson()).number(number).simCardType(simCardType).build();
    }
}
