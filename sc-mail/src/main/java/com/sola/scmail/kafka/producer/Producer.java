package com.sola.scmail.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.sola.scmail.kafka.KafkaMessage;
import com.sola.scmail.kafka.TopicConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Sola
 * @date 2019/01/16
 */
@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String msg) {
        KafkaMessage message = KafkaMessage.builder().id("_" + UUID.randomUUID().toString())
                .msg(msg)
                .sendTime(LocalDateTime.now()).build();
        kafkaTemplate.send(TopicConsts.TEST_TOPIC, message);
    }

}
