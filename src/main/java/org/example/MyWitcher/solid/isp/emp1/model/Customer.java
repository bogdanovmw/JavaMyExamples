package org.example.MyWitcher.solid.isp.emp1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}
