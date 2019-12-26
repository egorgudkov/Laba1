package com.epg8.laboratornaya1;

public class Sedan extends PassengerCar {

    public Sedan(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип кузова: Седан");
        super.showInfo();
    }
}
