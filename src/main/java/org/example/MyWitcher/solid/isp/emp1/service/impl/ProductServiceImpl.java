package org.example.MyWitcher.solid.isp.emp1.service.impl;

import org.example.MyWitcher.solid.isp.emp1.service.ProductService;

public class ProductServiceImpl {
    private ProductService i2;

    public ProductServiceImpl(ProductService i2) {
        this.i2 = i2;
    }

    public void callGetDate() {
        System.out.println(i2.getDate());
    }
}
