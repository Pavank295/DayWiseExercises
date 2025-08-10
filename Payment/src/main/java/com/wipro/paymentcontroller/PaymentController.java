package com.wipro.paymentcontroller;
import com.wipro.entity.Payment;
import com.wipro.paymentservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment savedPayment = paymentService.createPayment(payment);

        HttpHeaders headers = new HttpHeaders(null);
        headers.add("created-date", LocalDate.now().toString());

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body(savedPayment);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getPayment(@PathVariable Long id) {
        Payment payment = paymentService.getPayment(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("search-time", LocalDateTime.now().toString());

        if (payment == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("Payment with ID " + id + " not found.");
        }

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(payment);
    }
    @GetMapping
    public ResponseEntity<?> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();
        HttpHeaders headers = new HttpHeaders();
        headers.add("search-time", LocalDateTime.now().toString());

        if (payments.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("No payment records found.");
        }

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(payments);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        Payment updatedPayment = paymentService.updatePayment(id, payment);

        if (updatedPayment == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment with ID " + id + " not found.");
        }

        return ResponseEntity
                .ok("Data modified successfully");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePayment(@PathVariable Long id) {
        Payment payment = paymentService.getPayment(id);
        if (payment == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment with ID " + id + " not found.");
        }

        paymentService.deletePayment(id);
        return ResponseEntity
                .ok("Data deleted successfully");
    }
}

