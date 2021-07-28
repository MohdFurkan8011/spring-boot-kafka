package com.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootkafka.service.Producer;

@RestController
@RequestMapping("/topic/")
public class KafkaProducerController {

	@Autowired
	private Producer producer;
	
	@RequestMapping("/{message}")
	public ResponseEntity<String> sendMessage(@PathVariable("message") String message) {
		
		producer.sendMessage(message);
		return new ResponseEntity<>("Data sent successfully.", HttpStatus.OK);
	}
	
}
