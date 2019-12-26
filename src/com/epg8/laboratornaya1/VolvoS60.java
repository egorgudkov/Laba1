package com.epg8.laboratornaya1;

public class VolvoS60 extends Sedan {

    public VolvoS60(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: Volvo S60");
        super.showInfo();
    }
}
