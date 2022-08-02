package org.example.MyWitcher.pattern.behavioral.strategy.ex2.strategies;

/**
 * Общий интерфейс всех стратегий.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
