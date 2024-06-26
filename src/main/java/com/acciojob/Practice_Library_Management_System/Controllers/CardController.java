package com.acciojob.Practice_Library_Management_System.Controllers;

import com.acciojob.Practice_Library_Management_System.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/generateCard")
    public ResponseEntity addCard(){
        String result = cardService.generateCard();
        return new ResponseEntity(result, HttpStatus.OK);
    }


}
