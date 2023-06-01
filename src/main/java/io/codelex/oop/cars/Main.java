package io.codelex.oop.cars;

public class Main {

    public static void main(String[] args) {

        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1899, "Germany");

        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.equals(audi));

        Car bmw2 = new Car("5series", "535d", 20000,
                2015, "BMW", Car.EngineType.S6);
        Car audi2 = new Car("A6", "A6", 38000,
                2020, "AUDI", Car.EngineType.V6);

        System.out.println(bmw2.toString());
        System.out.println(audi2.toString());
        System.out.println(bmw2.equals(audi2));

    }
}
