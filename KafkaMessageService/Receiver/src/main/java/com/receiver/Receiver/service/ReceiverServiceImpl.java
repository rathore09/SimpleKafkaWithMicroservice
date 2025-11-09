package com.receiver.Receiver.service;

import com.receiver.Receiver.controller.ReceiverController;
import com.receiver.Receiver.model.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverServiceImpl implements ReceiverService{
    private static final Logger logger= LoggerFactory.getLogger(ReceiverServiceImpl.class);
    @Override
    @KafkaListener(topics = "message-topic", groupId = "my-group")
    public String receive(String msg) {
     logger.info("This is msg {}",msg);
     return msg;
    }
}
