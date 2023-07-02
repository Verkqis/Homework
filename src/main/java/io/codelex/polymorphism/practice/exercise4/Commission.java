package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }


    public void addSales(double addSales) {
        totalSales += addSales;
    }

    @Override
    public double pay() {
        double basePay = super.pay();
        double commision = totalSales * commissionRate;
        totalSales = 0.0;
        return basePay + commision;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }

}
