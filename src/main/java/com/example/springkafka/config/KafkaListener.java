package com.example.springkafka.config;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "topicA", groupId = "group1")
    void listener(String data) {
        System.out.println("Listener received data: " + data);
    }
}
