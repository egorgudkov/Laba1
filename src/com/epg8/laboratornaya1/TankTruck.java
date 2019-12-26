package com.epg8.laboratornaya1;

public class TankTruck extends Truck {

    public TankTruck(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Назначение: Автоцистерна");
        super.showInfo();
    }
}
