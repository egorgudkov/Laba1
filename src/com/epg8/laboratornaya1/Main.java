package com.epg8.laboratornaya1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("======= Gudkov Egor 8T6B =======");

        Car racingCar = new RacingCar(1900, 1000, 10000000);
        Car tankTruck = new TankTruck(2003, 5000, 35000);
        Car mazda3 = new Mazda3(2001, 10000, 17000);
        Car dodgeRam = new DodgeRam(2019, 100000, 5000);

        List<Car> cars = Arrays.asList(racingCar, tankTruck, mazda3, dodgeRam);
        for (Car car : cars) {
            car.showInfo();
        }
    }
}