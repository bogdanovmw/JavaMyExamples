package org.example.MyWitcher.java.generics;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

public class FormBeforeGenerics {
    public static void main(String[] args) {

    }

    // До дженериков
    public long getSum(List accounts) {
        long sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            Object account = accounts.get(i);
            if (account instanceof Account) {
                sum += ((Account) account).getAmount();
            }
        }
        return sum;
    }
    // С появлением дженериков
    public long getSumGenerics(List<Account> accounts) {
        long sum = 0;
        for (Account account : accounts) {
            sum += account.getAmount();
        }
        return sum;
    }
}

@Getter
@ToString
class Account {
    private long amount;
}