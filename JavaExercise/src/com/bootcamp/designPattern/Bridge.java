/*Implement Bridge Design Pattern for Color and Shape
such that Shape and Color can be combined together
 e.g BlueSquare, RedSquare, PinkTriangle etc.
* */

//TODO:Not Completed
package com.bootcamp.designPattern;

//Implementor
interface ColorStore {
    String getColorType();
}

//Concrete Implementor
class Fill implements ColorStore {

    String color;

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    @Override
    public String getColorType() {
        return "blue";
        //return setColor(String color);
    }
}

//Abstraction
abstract class Shape {
    private String type;
    private ColorStore colorStore;

    public Shape(String type, ColorStore colorStore) {
        this.type = type;
        this.colorStore = colorStore;
    }
}

//Refined Abstraction
class Triangle extends Shape {
    private String sides;

    public Triangle(ColorStore colorStore, String sides) {
        super("Equilateral Triangle", colorStore);
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides='" + sides + '\'' +
                '}';
    }
}

//Refined Abstraction
class Square extends Shape {
    private String sides;

    public Square(ColorStore colorStore, String sides) {
        super("Four Side Square", colorStore);
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides='" + sides + '\'' +
                '}';
    }
}

public class Bridge {
    // Triangle triangle=new Triangle(new Fill().getColorType("blue"),"Equilateral Triangle");
}
