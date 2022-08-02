package org.example.MyWitcher.pattern.behavioral.strategy.ex2.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Конкретная стратегия. Реализует оплату корзины интернет магазина через
 * платежную систему PayPal.
 */
public class PayByPayPal implements PayStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("1", "1");
    }

    /**
     * Собираем данные от клиента.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Введите свой email");
                email = READER.readLine();
                System.out.println("Введите свой пароль");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Проверка данных прошла успешно");
                } else {
                    System.out.println("Неправильный адрес электронной почты или пароль");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    /**
     * Если клиент уже вошел в систему, то для следующей оплаты данные вводить
     * не придется.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Оплатить " + paymentAmount + " используя PayPal");
            return true;
        } else {
            return false;
        }
    }
}
