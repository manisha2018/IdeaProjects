package com.bootcamp.restro;

public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Express Tea");
    }
}
