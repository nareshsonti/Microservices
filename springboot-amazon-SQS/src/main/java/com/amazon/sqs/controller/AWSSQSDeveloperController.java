package com.amazon.sqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.sqs.producer.SendMessageToAmzonSQSQueue;

@RestController
public class AWSSQSDeveloperController {

	@Autowired
	SendMessageToAmzonSQSQueue sendMessageToQueue;

	@PostMapping(value="/sendMessage")
	public void sendMessageToSQS() {
		sendMessageToQueue.sendMessageToQueue();
		System.out.println("Successfully posted");
	}
}
