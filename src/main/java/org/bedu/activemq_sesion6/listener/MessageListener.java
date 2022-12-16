package org.bedu.activemq_sesion6.listener;

import org.bedu.activemq_sesion6.config.JmsConfig;
import org.bedu.activemq_sesion6.model.GreetingMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

// Annotation
@Component
public class MessageListener {
    @JmsListener(destination = JmsConfig.QUEUE)

    public void
    listen(@Payload GreetingMessage greetingMessage,
           @Headers MessageHeaders messageHeaders,
           Message message)
    {

        // Display command
        System.out.println("Greeting Received!!!");

        System.out.println(greetingMessage);
    }
}
