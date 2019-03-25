/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package ch.sbb.ausbildungscamp.fahrzeit;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FahrzeitListener {

    @KafkaListener(topics = {"fahrzeit.updates"}, groupId = "fahrzeitListener")
    public void receiveMessage(final ConsumerRecord<String, String> record) {
    }

}
