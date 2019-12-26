package com.epg8.laboratornaya1;

public class DumpTruck extends Truck {

    public DumpTruck(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Назначение: Самосвал");
        super.showInfo();
    }
}
