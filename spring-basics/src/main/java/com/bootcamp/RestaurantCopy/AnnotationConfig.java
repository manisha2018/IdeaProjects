package com.bootcamp.RestaurantCopy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan(basePackages = "com.bootcamp.RestaurantCopy")
public class AnnotationConfig {

    //private HotDrink hotDrink;

    @Bean
    @Description("Provides the Tea class")
    public Tea tea() {
        return new Tea();
    }

   /* @Bean
    @Description("Provides the Express Tea class")
    public ExpressTea expressTea() {
        return new ExpressTea();
    }*/

    @Bean
    @Description("Provides restaurant class ")
    public Restaurant restaurant(){
        return new Restaurant(new Tea());
    }
}
