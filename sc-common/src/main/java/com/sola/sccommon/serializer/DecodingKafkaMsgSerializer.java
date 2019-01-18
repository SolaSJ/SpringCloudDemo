package com.sola.sccommon.serializer;

import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * @author Sola
 * @date 2019/01/18
 */
public class DecodingKafkaMsgSerializer implements Deserializer<Object> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public Object deserialize(String topic, byte[] data) {
        return BeanUtils.byte2Obj(data);
    }

    @Override
    public void close() {
    }

}