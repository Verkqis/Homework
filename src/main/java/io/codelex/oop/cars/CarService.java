package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private static List<Car> carList = new ArrayList<>();

    public static void addCar(Car car) {
        carList.add(car);
    }

    public static void removeCar(Car car) {
        carList.remove(car);
    }

    public static List<Car> getAllCars() {
        List<Car> allCars = carList;
        for (Car car : allCars) {
            System.out.println(car.getName() + " " + car.getModel());
        }
        return allCars;
    }

    public static List<Car> getV12EngineCars() {
        List<Car> allCars = carList;
        for (Car car : allCars) {
            if (car.getEngineType() == Car.EngineType.V12) {
                System.out.println("Cars with v12 engine " + car.getName() + " " + car.getModel());
            }
        }
        return allCars;
    }

    public static void getCarsBefore(int year) {
        List<Car> allCars = carList;
        for (Car car : allCars) {
            if (car.getYearOfManufacture() < year) {
                System.out.println("Cars before " + year + " " + car.getName() + " " + car.getModel());
            }
        }
    }

    public static Car getMostExpensiveCars() {
        List<Car> allCars = carList;
        return allCars.stream().max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }


    public static Car getCheapestCars() {
        List<Car> allCars = carList;
        return allCars.stream().min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public static List<Car> getCarsWithThreeManufacturers(int numberOfManufacturers) {
        List<Car> getCarsWithThreeManufacturers = new ArrayList<>();

        for (Car car : carList) {
            if (car.getManufacturer().length() >= numberOfManufacturers) {
                getCarsWithThreeManufacturers.add(car);
            }
        }
        return getCarsWithThreeManufacturers;
    }

    public static void getSortedAccordingPrice(String par) {
        List<Car> allCars = carList;
        if (par.equals("ascending")) {
            allCars.sort(Comparator.comparingDouble(Car::getPrice));
            System.out.println(allCars);
        } else if (par.equals("descending")) {
            allCars.sort(Comparator.comparingDouble(Car::getPrice).reversed());
            System.out.println(allCars);
        }
    }

    public static List<Car> getCarsByManufacturer(String par) {
        List<Car> allCars = carList;
        for (Car car : allCars) {
            if (car.getManufacturer().equals(par)) {
                System.out.println("Cars manufactured by " + par + ": " + car.getName() + " " + car.getModel());
            }
        }
        return allCars;
    }

}
