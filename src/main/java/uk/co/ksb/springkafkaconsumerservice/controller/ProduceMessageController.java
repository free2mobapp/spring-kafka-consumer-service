package uk.co.ksb.springkafkaconsumerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.ksb.springkafkaconsumerservice.model.KafkaMessage;
import uk.co.ksb.springkafkaconsumerservice.service.KafkaProducerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProduceMessageController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/produce")
    public void sendMessage(@RequestBody List<KafkaMessage> kafkaMessageList) {
        kafkaProducerService.sendMessage(kafkaMessageList);
    }
}