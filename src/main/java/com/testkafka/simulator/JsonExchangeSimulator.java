package com.testkafka.simulator;

import com.testkafka.model.DataModel;
import com.testkafka.producer.JsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class JsonExchangeSimulator {

    private final JsonProducer producer;

    private final Random random = new Random();

    private int count = -1;

    @Scheduled(fixedRate = 1000, initialDelay = 500)
    public void sendMessage() {
        producer.sendMessage(DataModel.builder()
                .x(count++)
                .y(random.nextDouble())
                .z(random.nextBoolean())
                .date(new Date())
                .build());
    }

}