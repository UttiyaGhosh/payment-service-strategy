package com.ug.paymentservicestrategy.service;

public interface PaymentStrategy {

    void register();
    String execute(double amount);
}
