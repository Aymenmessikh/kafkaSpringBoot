package com.example.consumer.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    @KafkaListener(topics = "msg", groupId = "myGroup")
    public void consumeMsg(String msg) {
        Consumer consumer= Consumer.builder()
                .msg(msg)
                .build();
        consumerRepository.save(consumer);
    }
}
