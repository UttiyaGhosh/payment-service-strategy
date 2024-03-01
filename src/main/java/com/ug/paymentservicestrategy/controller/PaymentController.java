package com.ug.paymentservicestrategy.controller;

import com.ug.paymentservicestrategy.model.enums.PaymentMode;
import com.ug.paymentservicestrategy.service.PaymentExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired private PaymentExecutor paymentExecutor;

    @PostMapping("/pay")
    public String placeOrder(@RequestParam PaymentMode paymentMode,
                           @RequestParam double amount){
        return paymentExecutor.processPayment(paymentMode,amount);
    }
}
