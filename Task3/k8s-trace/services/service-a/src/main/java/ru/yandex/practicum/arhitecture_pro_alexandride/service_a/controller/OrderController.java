package ru.yandex.practicum.arhitecture_pro_alexandride.service_a.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.arhitecture_pro_alexandride.service_a.adapter.PaymentAdapter;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/orders")
public class OrderController {

    private final PaymentAdapter paymentAdapter;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public String getUsers() {
        log.info("Выполняется запрос в сервисе заказов A");
        return paymentAdapter.processPayment();
    }
}


