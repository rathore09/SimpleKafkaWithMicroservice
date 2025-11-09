package com.sender.Sender.service;

import com.sender.Sender.model.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMsgServiceImpl implements SendMsgService{

    private static final String TOPIC = "message-topic";

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public String sendMsg(String msg) {
      kafkaTemplate.send(TOPIC,msg);
        return "msg send succefully ";
    }


}
