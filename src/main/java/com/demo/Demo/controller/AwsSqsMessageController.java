//package com.demo.Demo.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/app")
//public class AwsSqsMessageController {
//    Logger logger= LoggerFactory.getLogger(AwsSqsMessageController.class);
//
//    @Autowired(required = false)
//    private QueueMessagingTemplate queueMessagingTemplate;
//
//    @Value("${cloud.aws.end-point.uri}")
//    private String endpoint;
//
//    @GetMapping("/send/{message}")
//    public void sendMessageToQueue(@PathVariable String message) {
//        queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(message).build());
//    }
//
//    @SqsListener("testSQS")
//    public void loadMessageFromSQS(String message)  {
//        logger.info("message from SQS Queue {}",message);
//    }
//
//
//}
