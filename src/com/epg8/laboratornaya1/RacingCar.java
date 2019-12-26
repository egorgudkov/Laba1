package com.epg8.laboratornaya1;

public class RacingCar extends SpecialCar {

    public RacingCar(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Назначение: Гоночный автомобиль");
        super.showInfo();
    }
}
