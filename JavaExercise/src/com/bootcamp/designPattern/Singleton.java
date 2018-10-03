//Implement Singleton Design Pattern on a dummy class.

package com.bootcamp.designPattern;

class Dummy {

    static Dummy dummyInstance;

    private int name;
    private int age;

    private Dummy() {

    }

    static Dummy getDummyInstance() {
        if (dummyInstance == null) {
            dummyInstance = new Dummy();
        }
        return dummyInstance;
    }

    @Override
    public String toString() {
        return "dummy{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

public class Singleton {
    public static void main(String[] args) {
        System.out.println(Dummy.getDummyInstance());
        System.out.println(Dummy.getDummyInstance());
    }
}
