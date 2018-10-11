package com.bootcamp.restro;

public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Tea");
        //return null;
    }
}
