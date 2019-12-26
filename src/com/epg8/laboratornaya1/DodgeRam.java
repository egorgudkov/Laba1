package com.epg8.laboratornaya1;

public class DodgeRam extends Pickup {

    public DodgeRam(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: Dodge Ram");
        super.showInfo();
    }
}
