package com.example.producer.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/msg")
@RequiredArgsConstructor
public class msgController {
    private final msgService msgService;
    @PostMapping
    public ResponseEntity<String> sendMsg(@RequestBody String msg){
        String msg1=msgService.sendMessage(msg);
        return new ResponseEntity<>(msg1, HttpStatus.CREATED);
    }
}
