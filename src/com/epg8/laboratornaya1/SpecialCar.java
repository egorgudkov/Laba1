package com.epg8.laboratornaya1;

public class SpecialCar extends Car {

    public SpecialCar(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип: Специальный");
        super.showInfo();
    }
}
