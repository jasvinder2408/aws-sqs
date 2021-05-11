package com.demo.Demo.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQSSDK {

    AWSCredentials credentials = new BasicAWSCredentials(
            "AKIA2XFITKJFPQXBIMBO",
            "ZZw7VVbWSPkNLuDk64h22cLxKkKoBTphjdQgT9bY"
    );

    public AmazonSQS createSQSClient() {
        AmazonSQS sqs = AmazonSQSClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_2)
                .build();
        return sqs;
    }

    public String createStandardQu() {
        CreateQueueRequest createStandardQueueRequest = new CreateQueueRequest("testSQS");
        String standardQueueUrl = createSQSClient().createQueue(createStandardQueueRequest).getQueueUrl();
        return standardQueueUrl;
    }

    public void sendMsg() {
        Map<String, MessageAttributeValue> messageAttributes = new HashMap<>();
        messageAttributes.put("AttributeOne", new MessageAttributeValue()
                .withStringValue("This is an attribute")
                .withDataType("String"));

        SendMessageRequest sendMessageStandardQueue = new SendMessageRequest()
                .withQueueUrl(createStandardQu())
                .withMessageBody("A simple message.")
                .withDelaySeconds(30)
                .withMessageAttributes(messageAttributes);

        createSQSClient().sendMessage(sendMessageStandardQueue);
    }

    public List<Message> readFromQueue(){
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(createStandardQu())
                .withWaitTimeSeconds(10)
                .withMaxNumberOfMessages(10);

        List<Message> sqsMessages = createSQSClient().receiveMessage(receiveMessageRequest).getMessages();
    return sqsMessages;
    }

    public static void main(String [] args){

        new SQSSDK().sendMsg();
        List<Message>msgList=new SQSSDK().readFromQueue();
        for (Message msg:msgList){
            System.out.println(msg.getBody());
        }
    }

}


