package com.demo.Demo.controller;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.MessageAttributeValue;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class TesMsgController {

    @Autowired
    private AmazonSQS sqs;

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;

    @PostMapping("/send")
    public void send() {
        sendMsg();
    }

    @GetMapping("/read")
    public List<Message> read() {
        return readFromQueue();
    }

    public void sendMsg() {
        Map<String, MessageAttributeValue> messageAttributes = new HashMap<>();
        messageAttributes.put("AttributeOne", new MessageAttributeValue()
                .withStringValue("This is an parv, demo for sqs")
                .withDataType("String"));

        SendMessageRequest sendMessageStandardQueue = new SendMessageRequest()
                .withQueueUrl(endpoint)
                .withMessageBody("A simple message.")
                .withDelaySeconds(5)
                .withMessageAttributes(messageAttributes);

        sqs.sendMessage(sendMessageStandardQueue);
    }

    public List<Message> readFromQueue() {
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(endpoint)
                .withWaitTimeSeconds(10)
                .withMaxNumberOfMessages(10);

        List<Message> sqsMessages = sqs.receiveMessage(receiveMessageRequest).getMessages();
        return sqsMessages;
    }

}
