package org.bedu.activemq_sesion6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// Annotations
@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {
    // Task Configuration
    @Bean
    TaskExecutor taskExecutor()
    {
        return new SimpleAsyncTaskExecutor();
    }

    // taskExecutor bean is injected into spring context,
    // and spring will use it to execute tasks for us
}
