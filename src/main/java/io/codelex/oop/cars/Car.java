package io.codelex.oop.cars;

public class Car {

    enum EngineType {
        V12, V8, V6, S6, S4, S3
    }

    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private String manufacturer;
    private EngineType engineType;

    public Car(String name, String model, double price,
               int yearOfManufacture, String manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }


    public String getModel() {
        return model;
    }


    public double getPrice() {
        return this.price;
    }


    public int getYearOfManufacture() {
        return yearOfManufacture;
    }


    public String getManufacturer() {
        return this.manufacturer;
    }


    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer='" + manufacturer + '\'' +
                ", engineType=" + engineType +
                '}';
    }
}
