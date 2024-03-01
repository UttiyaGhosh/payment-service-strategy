package com.ug.paymentservicestrategy.service;

import com.ug.paymentservicestrategy.model.enums.PaymentMode;

public interface PaymentExecutor {

    String processPayment(PaymentMode paymentMode, double amount) ;
}
