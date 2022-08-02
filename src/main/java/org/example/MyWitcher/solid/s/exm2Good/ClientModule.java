package org.example.MyWitcher.solid.s.exm2Good;

import org.example.MyWitcher.solid.s.exm2Good.dao.EmployeeDAO;
import org.example.MyWitcher.solid.s.exm2Good.format.EmployeeReportFormatter;
import org.example.MyWitcher.solid.s.exm2Good.format.FormatType;

public class ClientModule {
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Max", "Dev", true);
        ClientModule.hireNewEmployee(e1);
        ClientModule.printEmployeeReport(e1, FormatType.CSV);
        ClientModule.terminateEmployee(e1);
    }
}
