package com.mftplus.simcardmicroservice.controller.api;

import com.mftplus.simcardmicroservice.dto.SimCardDto;
import com.mftplus.simcardmicroservice.model.SimCard;
import com.mftplus.simcardmicroservice.service.SimCardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimCardApi {
    private final SimCardService simCardService;

    public SimCardApi(SimCardService simCardService) {
        this.simCardService = simCardService;
    }

    @PostMapping("/simcards")
    public ResponseEntity<SimCard> save(@RequestBody SimCardDto simCardDto) throws Exception {
        SimCard simCard = simCardDto.getSimCard();
        simCardService.save(simCard);
        return ResponseEntity.ok(simCard);
    }
}
