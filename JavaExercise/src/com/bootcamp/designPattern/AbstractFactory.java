/*
Implement Abstract Factory Pattern to create cars of
different categories from different countries.
*/
package com.bootcamp.designPattern;

enum CarType {
    MICRO, MINI, LUXURY;
}

enum Location {
    JAPAN, USA, INDIA;
}

abstract class Car {

    CarType carType;

    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Luxury Car");
    }
}

class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Mini Car");
    }
}

class MicroCar extends Car {

    public MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Micro Car");
    }
}

class IndianCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }

}

class DefaultCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.JAPAN);
                break;
            case MINI:
                car = new MiniCar(Location.JAPAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.JAPAN);
                break;
        }
        return car;
    }

}


class USACarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;

    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case JAPAN:
                car = DefaultCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}

public class AbstractFactory {

    public static void main(String[] args) {

        System.out.println(
                CarFactory.buildCar(CarType.MICRO, Location.JAPAN)
        );
        Car usaCar = CarFactory.buildCar(CarType.MINI, Location.USA);
        System.out.println(usaCar);
    }
}
