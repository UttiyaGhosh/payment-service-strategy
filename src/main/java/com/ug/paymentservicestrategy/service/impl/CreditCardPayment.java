package com.ug.paymentservicestrategy.service.impl;

import com.ug.paymentservicestrategy.model.enums.PaymentMode;
import com.ug.paymentservicestrategy.service.PaymentStrategy;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import static com.ug.paymentservicestrategy.service.impl.PaymentExecutorImpl.addPaymentStrategy;

@Service
public class CreditCardPayment implements PaymentStrategy {
    @PostConstruct
    @Override
    public void register() {
        addPaymentStrategy(PaymentMode.CREDIT_CARD,this);
    }

    @Override
    public String execute(double amount) {
        return "Amount paid via credit card: "+amount;
    }
}
