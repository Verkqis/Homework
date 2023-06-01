package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Peter", "Brown", "ID1234",
                30, "CID1234", 10);

        System.out.println(customer.getInfo());
        customer.setPurchaseCount(25);
        System.out.println(customer.getInfo() + "\n");


        LocalDate startDate = LocalDate.of(2016, 5, 1);
        Employee employee = new Employee("John", "Brown", "ID39621748",
                45, "Accountant", startDate);

        System.out.println(employee.getInfo());

    }
}
