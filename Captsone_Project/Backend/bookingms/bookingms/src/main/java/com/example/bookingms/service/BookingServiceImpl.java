package com.example.bookingms.service;
import com.example.bookingms.dto.BookingRequest;
import com.example.bookingms.kafka.PaymentEvent;
import com.example.bookingms.kafka.PaymentProducer;
import com.example.bookingms.model.Booking;
import com.example.bookingms.model.BookingStatus;
import com.example.bookingms.repository.BookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingServiceImpl implements BookingService {

  private final BookingRepository repo;
  private final PaymentProducer producer;

  public BookingServiceImpl(BookingRepository repo, PaymentProducer producer) {
    this.repo = repo;
    this.producer = producer;
  }

  @Override
  @Transactional
  public Booking createBooking(BookingRequest req) {
    Booking booking = new Booking();
    booking.setFlightId(req.getFlightId());
    booking.setPassengerName(req.getPassengerName());
    booking.setPassengerEmail(req.getPassengerEmail());
    booking.setAmount(req.getAmount());
    booking.setPaymentMethod(req.getMethod());
    booking.setStatus(BookingStatus.INITIATED);

    Booking saved = repo.save(booking);

    // Publish PaymentEvent to Kafka (Topic T1)
    PaymentEvent event = new PaymentEvent(
        saved.getId(),
        saved.getFlightId(),
        saved.getAmount(),
        saved.getPaymentMethod(),
        "PAY"
    );
    producer.send(event);

    return saved;
  }

  @Override
  public Booking getBooking(Long id) {
    return repo.findById(id).orElse(null);
  }
}
