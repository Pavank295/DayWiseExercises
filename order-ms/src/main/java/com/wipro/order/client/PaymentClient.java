package com.wipro.order.client;
import com.wipro.order.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment")
public interface PaymentClient {
    @PostMapping("/payment")
    Payment createPayment(@RequestBody Payment payment);
}