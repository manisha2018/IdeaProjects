package com.bootcamp.java2;

class Singleton{
    private static Singleton obj ;

    private Singleton() {}
    public static Singleton getInstance() {
        if(obj==null) {
            obj = new Singleton();
        }
        return obj;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Singleton  singleton = Singleton.getInstance();
        Singleton  singleton2 = Singleton.getInstance();
        System.out.println(singleton==singleton2);
    }
}
