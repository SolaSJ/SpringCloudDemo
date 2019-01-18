package com.sola.scmail.kafka;

import com.sola.sccommon.kafka.KafkaMessage;
import com.sola.sccommon.kafka.TopicConsts;
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
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public void send(String msg) {
        KafkaMessage<String> message = new KafkaMessage<String>()
                .builder()
                .id(UUID.randomUUID().toString())
                .msg(msg)
                .sendTime(LocalDateTime.now())
                .build();
        kafkaTemplate.send(TopicConsts.TEST_TOPIC, message);
    }

}
