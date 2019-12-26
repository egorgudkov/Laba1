package com.epg8.laboratornaya1;

public class Truck extends Car {

    public Truck(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип: Грузовой");
        super.showInfo();
    }
}
