//Implement Decorator pattern to decorate the Pizza with topings.
package com.bootcamp.designPattern;

interface Pizza {
    String info();
}

class CheeseBurst implements Pizza {

    private int slice;

    public CheeseBurst(int slice) {
        this.slice = slice;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    @Override
    public String info() {
        return "Regular Pizza with slices:" + slice;
    }
}

class PanPizza implements Pizza {

    private int slice;

    public PanPizza(int slice) {
        this.slice = slice;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    @Override
    public String info() {
        return "Pan Pizza with slices:" + slice;
    }
}

class Toppings implements Pizza {

    private Pizza pizza;
    private String type;

    public Toppings(Pizza pizza, String type) {
        this.pizza = pizza;
        this.type = type;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String info() {
        return pizza.info() + "\twith Topping:" + type;
    }
}

public class Decorator {
    public static void main(String[] args) {
        CheeseBurst cheeseBurst = new CheeseBurst(6);
        System.out.println(cheeseBurst.info());

        Toppings toppings = new Toppings(new PanPizza(4), "sweet corn");
        System.out.println(toppings.info());
    }

}
