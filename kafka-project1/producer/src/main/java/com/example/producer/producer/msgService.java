package com.example.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class msgService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(String msg) {
        kafkaTemplate.send("msg", msg);
        return msg;
    }
}
