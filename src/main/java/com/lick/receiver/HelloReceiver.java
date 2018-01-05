package com.lick.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月03日 17:06
 * @copyright: 版权归所有
 */
@Component
/** 指定监听的队列 */
@RabbitListener(queues = "hello")
public class HelloReceiver {

    /** 指定处理消息的方法 */
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Rceiver : "+hello);

    }
}
