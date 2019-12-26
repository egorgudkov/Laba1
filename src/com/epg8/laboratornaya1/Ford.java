package com.epg8.laboratornaya1;

public class Ford extends Pickup {

    public Ford(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: Ford");
        super.showInfo();
    }
}
