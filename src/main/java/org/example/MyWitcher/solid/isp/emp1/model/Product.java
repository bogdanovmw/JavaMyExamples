package org.example.MyWitcher.solid.isp.emp1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {
    private Date date;

    public Product(Date date) {
        this.date = date;
    }
}
