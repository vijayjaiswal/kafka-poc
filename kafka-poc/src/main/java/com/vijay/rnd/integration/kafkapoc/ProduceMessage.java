package com.vijay.rnd.integration.kafkapoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProduceMessage {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private String topicName = "baeldung";

	public void sendMessage(String msg) {
		kafkaTemplate.send(topicName, msg);
	}
}
