/*Implement Bridge Design Pattern for Color and Shape
such that Shape and Color can be combined together
 e.g BlueSquare, RedSquare, PinkTriangle etc.
* */

package com.bootcamp.designPattern;

interface Color {
    void fillColor();
}

class Red implements Color {

    @Override
    public void fillColor() {
        System.out.println("Red color");

    }
}

class Blue implements Color {

    @Override
    public void fillColor() {
        System.out.println("Blue color");

    }
}

abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void calculateArea();
}

class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void calculateArea() {
        System.out.println("3.14*r*r");
    }
}

public class Bridge {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        shape.calculateArea();
        shape.color.fillColor();
    }
}
