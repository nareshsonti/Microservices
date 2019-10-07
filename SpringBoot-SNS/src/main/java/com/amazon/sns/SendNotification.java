package com.amazon.sns;

import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.util.Topics;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

public class SendNotification {
	public static void main(String[] args) throws InterruptedException {
		AmazonSNS client = AmazonSNSClientBuilder.standard().withRegion("us-west-2")
				.withCredentials(new AWSStaticCredentialsProvider(
						new BasicAWSCredentials("AKIASPMQNMTUVVJ362UV", "XioQiTNqugtbuAcdpNS1y/ePz72xXX+XRn/35Zel")))
				.build();
		
		
		
		
		 AmazonSQS sqs = AmazonSQSClientBuilder.standard().withRegion(Regions.US_WEST_2)
			.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIASPMQNMTUVVJ362UV", "XioQiTNqugtbuAcdpNS1y/ePz72xXX+XRn/35Zel")))
			.build();
		 
		 Topics.subscribeQueue(client, sqs, "arn:aws:sns:us-west-2:170490946793:java", "https://sqs.us-west-2.amazonaws.com/170490946793/java-sns-test");
		client.publish("arn:aws:sns:us-west-2:170490946793:java", "SQS Exmaple ", "Sqs Message");
	
		Thread.sleep(60000);
		List<Message> mesg = sqs.receiveMessage("https://sqs.us-west-2.amazonaws.com/170490946793/java-sns-test").getMessages();
		if(mesg.size()>0) {
			System.out.println("recive message "+mesg.get(0).getBody());
		}
	
	
	}
	
	
	

}
