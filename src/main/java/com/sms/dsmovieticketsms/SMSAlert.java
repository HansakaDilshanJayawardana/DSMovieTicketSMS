package com.sms.dsmovieticketsms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SMSAlert implements Serializable {

    public SMSAlert() {
    }

    public void sendsms(String... args) throws Exception {
        Twilio.init("AC76418660cf9cf0e9cff6df7841e27892", "1f104c67dc5348ff935d1908fe35910e");
        Message.creator(new PhoneNumber("+94773125349"), new PhoneNumber("+12183963759"), "This is a confirmation message!!!").create();
    }

}
