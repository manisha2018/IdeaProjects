//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
package com.bootcamp.java2;

class A {

}

class NoClassDef {
    public static void main(String args[]) {
        A a = new A();
    }

}


public class Question3 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
