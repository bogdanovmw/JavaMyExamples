package org.example.MyWitcher.solid.srp.exm2Good.dao;

import org.example.MyWitcher.solid.srp.exm2Good.Employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        System.out.println(employee + " saved!");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(employee + " deleted!");
    }
}
