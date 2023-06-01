package io.codelex.oop.cars;

public class MainCarService {
    public static void main(String[] args) {

        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1899, "Germany");
        Manufacturer toyota = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer ford = new Manufacturer("Ford", 1903, "United States");
        Manufacturer nissan = new Manufacturer("Nissan", 1933, "Japan");


        Car car1 = new Car("BMW", "535d", 20000.0, 2015, "BMW", Car.EngineType.S6);
        Car car2 = new Car("Audi", "A6", 38000.0, 2020, "AUDI", Car.EngineType.V6);
        Car car3 = new Car("Nissan", "GTR", 110000.0, 2022, "Nissan", Car.EngineType.V6);
        Car car4 = new Car("Toyota", "Corolla", 25000.0, 2021, "Toyota", Car.EngineType.S4);
        Car car5 = new Car("Ford", "Mustang", 50000.0, 2022, "Ford", Car.EngineType.V8);
        Car car6 = new Car("BMW", "760", 150000.0, 2022, "BMW", Car.EngineType.V12);
        Car car7 = new Car("Audi", "100", 1000.0, 1989, "Audi", Car.EngineType.V8);

        CarService.addCar(car1);
        CarService.addCar(car2);
        CarService.addCar(car3);
        CarService.addCar(car4);
        CarService.addCar(car5);
        CarService.addCar(car6);
        CarService.addCar(car7);

        CarService.getAllCars();

        CarService.removeCar(car4);

        CarService.getAllCars();

        CarService.getV12EngineCars();

        CarService.getCarsBefore(1999);

        System.out.println(CarService.getMostExpensiveCars());

        System.out.println(CarService.getCheapestCars());

        System.out.println(CarService.getCarsWithThreeManufacturers(3));

        CarService.getSortedAccordingPrice("ascending");
        CarService.getSortedAccordingPrice("descending");
        CarService.getCarsByManufacturer("BMW");

    }


}
