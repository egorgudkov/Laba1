package com.epg8.laboratornaya1;

public class Mazda3 extends Sedan {

    public Mazda3(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: Mazda 3");
        super.showInfo();
    }
}
