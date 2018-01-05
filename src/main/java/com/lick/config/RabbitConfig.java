package com.lick.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月03日 20:56
 * @copyright: 版权归hsyuntai 所有
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
