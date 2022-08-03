package org.example.MyWitcher.solid.isp.emp1.service.impl;

import org.example.MyWitcher.solid.isp.emp1.service.CustomerService;

public class CustomerServiceImpl {
    private CustomerService i1;

    public CustomerServiceImpl(CustomerService i1) {
        this.i1 = i1;
    }

    public void callGetName() {
        System.out.println(i1.getName());
    }
}
