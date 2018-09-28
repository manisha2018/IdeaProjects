package com.bootcamp.java2;

class Parent extends Grandparent {

    static {
        System.out.println("static - parent");
    }

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }
}

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }

    public Child() {
        System.out.println("constructor - child");
    }
}

public class Question12 {

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child);

    }
}
