package org.example.MyWitcher.pattern.behavioral.strategy.ex2;

import org.example.MyWitcher.pattern.behavioral.strategy.ex2.order.Order;
import org.example.MyWitcher.pattern.behavioral.strategy.ex2.strategies.PayByCreditCard;
import org.example.MyWitcher.pattern.behavioral.strategy.ex2.strategies.PayByPayPal;
import org.example.MyWitcher.pattern.behavioral.strategy.ex2.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            System.out.print("Пожалуйста, выберите продукт:" + "\n" + "1 - Системная плата" + "\n" + "2 - CPU" + "\n" + "3 - HDD" + "\n" + "4 - Memory" + "\n");
            reader.readLine();

            if (strategy == null) {
                System.out.println("Пожалуйста, выберите способ оплаты:" + "\n" + "1 - PalPay" + "\n" + "2 - Кредитная карта");
                String paymentMethod = reader.readLine();

                // Клиент создаёт различные стратегии на основании
                // пользовательских данных, конфигурации и прочих параметров.
                if (paymentMethod.equals("1"))
                    strategy = new PayByPayPal();
                else
                    strategy = new PayByCreditCard();
            }

            // Объект заказа делегирует сбор платёжных данны стратегии, т.к.
            // только стратегии знают какие данные им нужны для приёма оплаты.
            order.processOrder(strategy);
            if (strategy.pay(order.getTotalCost()))
                System.out.println("Платеж прошел успешно");
            else
                System.out.println("Пожалуйста, проверьте свои данные");
            order.setClosed();
        }
    }
}
