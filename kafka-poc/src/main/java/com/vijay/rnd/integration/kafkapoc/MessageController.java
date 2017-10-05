package com.vijay.rnd.integration.kafkapoc;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {
	@Autowired
	ProduceMessage produceMessage;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String send(@RequestBody String msg) {
		Date now = new Date();
		String message = now + " : Welcome User! " + msg;
		produceMessage.sendMessage(message);
		return message;
	}
}
