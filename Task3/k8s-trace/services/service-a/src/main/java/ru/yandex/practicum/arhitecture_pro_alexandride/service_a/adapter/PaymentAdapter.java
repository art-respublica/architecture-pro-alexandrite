package ru.yandex.practicum.arhitecture_pro_alexandride.service_a.adapter;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentAdapter {

    private final PaymentFeignClient feignClient;

    public String processPayment() {
        try {
            processMethod();
            String result = feignClient.getPayments();
            processMethod();
            return result;
        } catch (FeignException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void processMethod() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            log.error("Что-то пошло не так :)");
        }
    }
}
