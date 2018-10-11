package com.bootcamp.restro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantAutowireMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("restro-autowire.xml");
        Restaurant restaurant = applicationContext.getBean
                (Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
    }
}
