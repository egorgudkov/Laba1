package com.epg8.laboratornaya1;

public class Pickup extends PassengerCar {

    public Pickup(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип кузова: Пикап");
        super.showInfo();
    }
}
