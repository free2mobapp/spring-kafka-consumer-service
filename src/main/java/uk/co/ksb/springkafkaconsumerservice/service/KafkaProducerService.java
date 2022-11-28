package uk.co.ksb.springkafkaconsumerservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import uk.co.ksb.springkafkaconsumerservice.model.KafkaMessage;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    @Value("${kafka.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public void sendMessage(@RequestBody List<KafkaMessage> kafkaMessageList) {
        kafkaMessageList.forEach(kafkaMessage -> kafkaTemplate.send(topic, UUID.randomUUID().toString(), kafkaMessage));
    }
}
