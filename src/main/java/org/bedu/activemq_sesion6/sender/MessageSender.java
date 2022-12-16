package org.bedu.activemq_sesion6.sender;

import lombok.RequiredArgsConstructor;
import org.bedu.activemq_sesion6.config.JmsConfig;
import org.bedu.activemq_sesion6.model.GreetingMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

// Annotations
@RequiredArgsConstructor
@Component
public class MessageSender {
    // Class data member
    private final JmsTemplate jmsTemplate;
    private static Integer ID = 1;

    // Annotation
    @Scheduled(fixedRate = 2000)

    // Method
    public void sendMessage()
    {
        // Display command
        System.out.println("Greetings user");

        GreetingMessage message
                = GreetingMessage.builder()
                .id(UUID.randomUUID())
                .message("Greetings user " + ID++)
                .build();

        jmsTemplate.convertAndSend(JmsConfig.QUEUE,
                message);

        // Display command
        System.out.println("Message sent!!!");
    }
}
