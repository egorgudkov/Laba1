package com.epg8.laboratornaya1;

public class PassengerCar extends Car {

    public PassengerCar(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип: Легковой");
        super.showInfo();
    }
}
