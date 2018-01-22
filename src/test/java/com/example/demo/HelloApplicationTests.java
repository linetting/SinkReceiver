//package com.example.demo;
//
//import com.example.demo.sender.SinkSender;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
///**
// * Created by 26970 on 2018/1/22.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = HelloApplicationTests.class)
//@WebAppConfiguration
//public class HelloApplicationTests {
//
//    @Autowired
//    private SinkSender sinkSender;
//
//    @Test
//    public void contextLoads() {
//        sinkSender.output().send(MessageBuilder.withPayload("from sinksender").build());
//    }
//}
