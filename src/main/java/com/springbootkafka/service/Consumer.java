package com.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "test")
	public void consume(String message) {
		
		System.out.println("Consumer Message => " + message);
	}
	
}
