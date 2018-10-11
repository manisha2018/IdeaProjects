package com.bootcamp.RestaurantCopy;

import org.springframework.beans.factory.annotation.Autowired;

public class Tea implements HotDrink {

    @Autowired
    private String teaType;

    public Tea() {
    }

    @Autowired
    public Tea(String teaType) {
        this.teaType = teaType;
    }

    public String getTeaType() {
        return teaType;
    }

    @Autowired
    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Tea");
    }
}
