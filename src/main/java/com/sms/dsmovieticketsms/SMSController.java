package com.sms.dsmovieticketsms;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/sms", method = RequestMethod.GET)
public class SMSController {

    @Autowired
    private SMSAlert smsalert;

    public SMSController() {
    }
    @PostMapping("/send-sms")
    public void send() throws Exception {
        this.smsalert.sendsms(new String[0]);
    }

}
