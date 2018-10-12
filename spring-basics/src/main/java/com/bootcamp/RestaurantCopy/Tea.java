package com.bootcamp.RestaurantCopy;

public class Tea implements HotDrink {

    private String teaType;

    public Tea() {
    }

    public Tea(String teaType) {
        this.teaType = teaType;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Tea");
    }
}
