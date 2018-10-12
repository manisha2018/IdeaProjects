package com.bootcamp.RestaurantCopy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestaurantMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();

//        Restaurant restaurant1 = applicationContext.getBean(Restaurant.class);
//        restaurant1.getHotDrink().prepareHotDrink();

    }
}
