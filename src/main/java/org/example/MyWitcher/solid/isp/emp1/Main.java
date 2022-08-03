package org.example.MyWitcher.solid.isp.emp1;

import org.example.MyWitcher.solid.isp.emp1.model.Customer;
import org.example.MyWitcher.solid.isp.emp1.model.Product;
import org.example.MyWitcher.solid.isp.emp1.service.CustomerService;
import org.example.MyWitcher.solid.isp.emp1.service.ProductService;

import java.util.Date;


public class Main implements CustomerService, ProductService {
    private Customer customer;
    private Product product;

    public Main(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return product.getDate();
    }

    public static void main(String[] args) {
        Main i = new Main(new Customer("Max"), new Product(new Date()));
        System.out.println(i.getName());
        System.out.println(i.getDate());
    }
}
