package com.springbootkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private final String TOPIC = "test";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		
		System.out.println("Producing Message => " + message);
		kafkaTemplate.send(TOPIC, message);
	}
	
}
