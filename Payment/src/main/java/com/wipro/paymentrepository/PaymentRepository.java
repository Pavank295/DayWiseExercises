package com.wipro.paymentrepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
