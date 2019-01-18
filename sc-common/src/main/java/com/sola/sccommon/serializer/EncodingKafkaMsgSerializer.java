package com.sola.sccommon.serializer;

import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * @author Sola
 * @date 2019/01/18
 */
public class EncodingKafkaMsgSerializer implements Serializer<Object> {

    @Override
    public void configure(Map configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String topic, Object data) {
        return BeanUtils.bean2Byte(data);
    }

    /**
     * producer调用close()方法是调用
     */
    @Override
    public void close() {
    }

}
