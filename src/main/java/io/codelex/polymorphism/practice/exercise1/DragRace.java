package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {


        Car audi = new Audi("Audi RS6");
        Car bmw = new Bmw("BMW M5");
        Car tesla = new Tesla("Tesla Model X");
        Car lexus = new Lexus("Lexus IS200");
        Car nissan = new Nissan("Nissan GTR");
        Car volvo = new Volvo("Volvo XC90");

        List<Car> cars = new ArrayList<>();

//        cars.add(audi);
//        cars.add(bmw);
//        cars.add(tesla);
        cars.add(lexus);
        cars.add(nissan);
//        cars.add(volvo);


        for (int i = 1; i <= 10; i++) {
            for (Car car : cars) {
                car.startEngine();
                car.speedUp();
                car.slowDown();

                if (i == 3 && car instanceof Nitro nitroCar) {
                    nitroCar.useNitrousOxideEngine();
                }
            }

        }

        Car fastestCar = null;
        Integer maxSpeed = 0;

        for (Car car : cars) {
            if (car.speedUp() > maxSpeed) {
                maxSpeed = car.speedUp();
                fastestCar = car;
            }
        }

        if (fastestCar != null) {
            System.out.println("Fastest car is: " + fastestCar.getName() + " with " + fastestCar.showCurrentSpeed() + " km/h speed! ");
        }
    }
}
