package com.receiver.Receiver.controller;

import com.receiver.Receiver.service.ReceiverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {
    private static final Logger LOGGER= LoggerFactory.getLogger(ReceiverController.class);
    @Autowired
    ReceiverService receiverService;
    @GetMapping("/get")
    public  String receive(){
        LOGGER.info("this is receiver of msg {}");
        return "this is msg i got";
    }

}
