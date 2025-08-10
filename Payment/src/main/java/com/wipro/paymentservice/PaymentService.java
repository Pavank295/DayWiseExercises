package com.wipro.paymentservice;
import com.wipro.entity.Payment;
import com.wipro.paymentrepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment getPayment(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment updatePayment(Long id, Payment paymentDetails) {
        Payment payment = paymentRepository.findById(id).orElse(null);
        if (payment != null) {
            payment.setPaymentMode(paymentDetails.getPaymentMode());
            payment.setAmount(paymentDetails.getAmount());
            payment.setDescription(paymentDetails.getDescription());
            return paymentRepository.save(payment);
        }
        return null;
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
