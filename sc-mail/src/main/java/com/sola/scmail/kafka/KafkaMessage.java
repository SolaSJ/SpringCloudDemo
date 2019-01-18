package com.sola.scmail.kafka;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Sola
 * @date 2019/01/16
 */
@Data
@Builder
public class KafkaMessage implements Serializable {

    private String id;

    private String msg;

    private LocalDateTime sendTime;

}
