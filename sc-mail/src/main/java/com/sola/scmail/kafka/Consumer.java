package com.sola.scmail.kafka;

import com.alibaba.fastjson.JSON;
import com.sola.sccommon.kafka.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Sola
 * @date 2019/01/18
 */
@Slf4j
@Component
public class Consumer {

    @KafkaListener(topics = {"test"})
    public void processMessage(KafkaMessage kafkaMessage) {
        log.info("receive message: {}", JSON.toJSONString(kafkaMessage));
    }

}
