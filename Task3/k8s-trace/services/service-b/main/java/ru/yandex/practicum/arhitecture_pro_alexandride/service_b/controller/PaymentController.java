package ru.yandex.practicum.arhitecture_pro_alexandride.service_b.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/payments")
public class PaymentController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public String getPayments() {
        log.info("Выполняется запрос в платежном сервисе B");
        processMethod();
        return "DONE";
    }

    private void processMethod() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            log.error("Что-то пошло не так :)");
        }
    }
}
