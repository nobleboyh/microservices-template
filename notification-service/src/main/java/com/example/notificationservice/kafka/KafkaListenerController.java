package com.example.notificationservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

@Controller
public class KafkaListenerController {

    @KafkaListener(topics = "${spring.kafka.topics.topic1}")
    public void listenToService1(String message){
        System.out.println(message);
    }
}
