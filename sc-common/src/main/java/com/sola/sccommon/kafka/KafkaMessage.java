package com.sola.sccommon.kafka;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Sola
 * @date 2019/01/16
 */
@Data
@NoArgsConstructor
public class KafkaMessage<T> implements Serializable {

    private String id;

    private T msg;

    private LocalDateTime sendTime;

    /**
     * 这里手动实现builder, 是因为静态泛型方法不继承泛型类的类型, 使用lombok自动生成的代码不能满足
     * <p>
     * 代码示例:
     * <pre>
     * KafkaMessage<String> message = new KafkaMessage<String>()
     *     .builder()
     *     .id(UUID.randomUUID().toString())
     *     .msg(msg)
     *     .sendTime(LocalDateTime.now())
     *     .build();
     * <pre>
     *
     * @return
     */
    public Builder builder() {
        return new Builder();
    }

    public class Builder {
        private KafkaMessage<T> kafkaMessage;

        private Builder() {
            kafkaMessage = new KafkaMessage<>();
        }

        public KafkaMessage<T> build() {
            return kafkaMessage;
        }

        public Builder id(String id) {
            kafkaMessage.setId(id);
            return this;
        }

        public Builder msg(T msg) {
            kafkaMessage.setMsg(msg);
            return this;
        }

        public Builder sendTime(LocalDateTime sendTime) {
            kafkaMessage.setSendTime(sendTime);
            return this;
        }

    }

}
