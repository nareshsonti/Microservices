package com.amazon.sqs.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
@Component
public class SendMessageToAmzonSQSQueue {

	@Autowired
	QueueMessagingTemplate template;
	
	@Value("${cloud.aws.end-point.uri}")
	private String endPoint;

	public void sendMessageToQueue() {
		template.send(endPoint,MessageBuilder.withPayload("This is SQS message").build());
		}
	@SqsListener("java-sqs")
	public void readMessage(String message) {
		
		System.out.println("Reading message "+message);
	}

}
