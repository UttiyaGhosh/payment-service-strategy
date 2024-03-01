package com.ug.paymentservicestrategy.service.impl;

import com.ug.paymentservicestrategy.model.enums.PaymentMode;
import com.ug.paymentservicestrategy.service.PaymentExecutor;
import com.ug.paymentservicestrategy.service.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaymentExecutorImpl implements PaymentExecutor {
    private static HashMap<PaymentMode, PaymentStrategy> paymentStrategyMap = new HashMap<>();

    public static void addPaymentStrategy(PaymentMode paymentMode, PaymentStrategy paymentStrategy) {
        paymentStrategyMap.put(paymentMode, paymentStrategy);
    }
    @Override
    public String processPayment(PaymentMode paymentMode,double amount) {
        return paymentStrategyMap.get(paymentMode)
                .execute(amount);
    }
}
