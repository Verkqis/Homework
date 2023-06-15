package io.codelex.oop.summary;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OrderProgram {

    public static void main(String[] args) throws ParseException {


        FoodItem milk = new FoodItem("Milk", 0.75, new SimpleDateFormat("dd.MM.yyyy").parse("10.07.2023"));

        ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);

        HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");

        ItemPacking packing = new ItemPacking();

        Order order = new Order();

        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);
        order.addItem(packing);


        Invoice invoice = new Invoice(order, "INV123");

        System.out.println(invoice.formattedInvoice());

    }
}
