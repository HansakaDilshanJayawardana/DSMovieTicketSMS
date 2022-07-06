package com.sms.dsmovieticketsms.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SMSRequest {

    private String phone;
    private String sms;

}
