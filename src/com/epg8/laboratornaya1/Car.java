package com.epg8.laboratornaya1;

public class Car {

    private int mYear;
    private int mMileage;
    private int mPrice;

    private static final String TXT_BORDER = "=================================";

    public Car(int year, int mileage, int price) {
        mYear = year;
        mMileage = mileage;
        mPrice = price;
    }

    public void showInfo() {
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Пробег: " + getMileage() + " км");
        System.out.println(("Цена: $" + getPrice()));
        System.out.println(TXT_BORDER);
    }

    public int getYear() {
        return mYear;
    }

    public int getMileage() {
        return mMileage;
    }

    public int getPrice() {
        return mPrice;
    }
}
