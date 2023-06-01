package io.codelex.oop.persons;

public class Customer extends Person {

    private String costumerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age,
                    String costumerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.costumerId = costumerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + costumerId + " (" + getPurchaseCount() + " purchases) ";
    }
}
