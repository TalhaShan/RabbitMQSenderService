package com.mq.rabbitmq.microservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;

}
