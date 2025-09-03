package com.example.bookingms.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentProducer {

  public static final String TOPIC_T1 = "T1-payments"; // booking -> payment

  private final KafkaTemplate<String, Object> template;

  public PaymentProducer(KafkaTemplate<String, Object> template) {
    this.template = template;
  }

  public void send(PaymentEvent event) {
    template.send(TOPIC_T1, event);
  }
}
