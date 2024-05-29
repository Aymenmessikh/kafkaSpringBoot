package com.example.kafka.consumer;

import com.example.kafka.Entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "messageKafka", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from messageKafka Topic:: %s", msg));
    }

    @KafkaListener(topics = "messageKafka", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from messageKafka Topic:: %s", student.toString()));
    }
}