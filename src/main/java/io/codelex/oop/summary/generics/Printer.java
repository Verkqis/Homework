package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Printer<T> {

    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public static void main(String[] args) {

        Printer<BigDecimal> bD = new Printer(122.222);

        bD.print();
    }
}
