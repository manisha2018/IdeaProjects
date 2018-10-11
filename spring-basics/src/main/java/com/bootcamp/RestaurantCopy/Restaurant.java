package com.bootcamp.RestaurantCopy;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    private HotDrink hotDrink;

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
