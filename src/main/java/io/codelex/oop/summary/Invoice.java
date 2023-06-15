package io.codelex.oop.summary;

import java.text.DecimalFormat;

public class Invoice {

    private Order order;
    private String invoiceNumber;
    private InvoiceStatus invoiceStatus;
    private double priceWithoutVAT;
    private double priceWithVAT;


    public Invoice(Order order, String invoiceNumber) {
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.invoiceStatus = InvoiceStatus.APPROVED;
        calculatePrices();
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    private void calculatePrices() {
        double totalWithoutVAT = 0.0;
        for (SellableThing item : order.getItems()) {
            totalWithoutVAT += item.getPrice();
        }

        double VATRate = 0.21;
        priceWithoutVAT = totalWithoutVAT;
        priceWithVAT = totalWithoutVAT * (1 + VATRate);
    }

    public String formattedInvoice() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#0.00");
        double vat = priceWithVAT - priceWithoutVAT;
        int length = order.itemList().length() / 2;
        String blank = " ";

        sb.append("=".repeat(length)).append("\n");
        sb.append("= INVOICE NUMBER: ").append(invoiceNumber).append(blank.repeat(length - 19 - invoiceNumber.length())).append("=").append("\n");
        sb.append("= STATUS: ").append(invoiceStatus).append(blank.repeat(length - 19)).append("=").append("\n");
        sb.append(order.itemList());
        sb.append("= SUM: ").append(df.format(priceWithoutVAT)).append(" EUR").append(blank.repeat(length - 17)).append("=").append("\n");
        sb.append("= VAT (21%): ").append(df.format(vat)).append(" EUR").append(blank.repeat(length - 22)).append("=").append("\n");
        sb.append("= TOTAL: ").append(df.format(priceWithVAT)).append(" EUR").append(blank.repeat(length - 19)).append("=").append("\n");
        sb.append("=".repeat(length)).append("\n");

        return sb.toString();
    }
}
