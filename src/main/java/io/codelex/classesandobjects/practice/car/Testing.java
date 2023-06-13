package io.codelex.classesandobjects.practice.car;

public class Testing {
    public static void main(String[] args) {
        Car car = new Car(10000);

        car.fillUp(10500, 20);
        System.out.println("First fill up - Kilometers per liter are " + car.calculateConsumption());
        System.out.println("Gas Hog? " + car.gasHog());
        System.out.println("Economy Car? " + car.economyCar());

        car.fillUp(11000, 150);
        System.out.println("Second fill up - Kilometers per liter are " + car.calculateConsumption());
        System.out.println("Gas Hog? " + car.gasHog());
        System.out.println("Economy Car? " + car.economyCar());
    }

}
