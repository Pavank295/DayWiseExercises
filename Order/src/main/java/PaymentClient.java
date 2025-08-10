import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.entity.Payment;

@FeignClient(name = "payment-ms") 
public interface PaymentClient {

    @PostMapping("/payment")
    ResponseEntity<Payment> makePayment(@RequestBody Payment payment);

    @GetMapping("/payment/order/{orderId}")
    ResponseEntity<List<Payment>> getPaymentsByOrderId(@PathVariable Long orderId);
}
