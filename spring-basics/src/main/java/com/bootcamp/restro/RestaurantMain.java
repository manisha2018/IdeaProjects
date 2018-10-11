package com.bootcamp.restro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("restro-config.xml");
        Restaurant restaurant = applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();

        System.out.println(applicationContext.isPrototype("tea"));

       /* Restaurant restaurant1 = applicationContext.getBean(Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();*/
    }
}
