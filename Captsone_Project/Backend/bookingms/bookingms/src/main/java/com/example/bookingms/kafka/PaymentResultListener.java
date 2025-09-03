package com.example.bookingms.kafka;

import com.example.bookingms.model.Booking;
import com.example.bookingms.model.BookingStatus;
import com.example.bookingms.repository.BookingRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PaymentResultListener {

  public static final String TOPIC_T2 = "T2-payment-results"; // payment -> booking

  private final BookingRepository repo;

  public PaymentResultListener(BookingRepository repo) {
    this.repo = repo;
  }

  @KafkaListener(topics = TOPIC_T2, containerFactory = "paymentResultKafkaListenerContainerFactory")
  public void onResult(PaymentResult result) {
    if (result == null || result.getBookingId() == null) return;

    Optional<Booking> opt = repo.findById(result.getBookingId());
    if (opt.isPresent()) {
      Booking b = opt.get();
      if ("SUCCESS".equalsIgnoreCase(result.getStatus())) {
        b.setStatus(BookingStatus.SUCCESS);
      } else {
        b.setStatus(BookingStatus.FAILED);
      }
      repo.save(b);
    }
  }
}
