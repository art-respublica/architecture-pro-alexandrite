package ru.yandex.practicum.arhitecture_pro_alexandride.service_a.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "paymentServiceClient", url = "${payment-service.url}")
public interface PaymentFeignClient {

    @GetMapping("/api/payments")
    String getPayments();
}
