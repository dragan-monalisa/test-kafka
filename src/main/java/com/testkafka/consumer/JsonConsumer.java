package com.testkafka.consumer;

import com.testkafka.model.DataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JsonConsumer {

    @KafkaListener(topics = "jsonTopicName", containerFactory = "kafkaListenerDataModelContainerFactory")
    public void consumeMessage(DataModel message) {
        log.info("Consuming json message : {}", message);
    }

}
