package org.bedu.activemq_sesion6;

import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivemqSesion6Application {

    public static void main(String[] args) throws Exception {
        // Embedded Server Configuration
        ActiveMQServer activeMQServer = ActiveMQServers
        .newActiveMQServer(
            new ConfigurationImpl()
            .setPersistenceEnabled(false)
            .setJournalDirectory("/opt/activemq/data/journal")
            .setSecurityEnabled(false)
            .addAcceptorConfiguration("invm","vm://0")
        );

        activeMQServer.start();
        SpringApplication.run(ActivemqSesion6Application.class, args);
    }

}
