//Implement Factory Pattern to get the Polygon of differnt type.
package com.bootcamp.designPattern;

interface PolygonType {
    void polygonType();
}

class Hexagon implements PolygonType {

    private Integer side;

    public Integer getSide() {
        return side;
    }

    public Integer setSide(Integer side) {
        this.side = side;
        return side * side * side;
    }

    @Override
    public void polygonType() {
        System.out.println("This is a Hexagon Polygon");
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                '}';
    }
}

class Rectangle implements PolygonType {

    @Override
    public void polygonType() {
        System.out.println("This is a Rectangle Polygon");
    }
}

class Pentagon implements PolygonType {

    @Override
    public void polygonType() {
        System.out.println("This is a Pentagon Polygon");
    }
}

class Polygon {
    private PolygonType polygonType;

    public PolygonType getPolygonType() {
        return polygonType;
    }

    public void setPolygonType(PolygonType polygonType) {
        this.polygonType = polygonType;
    }
}

class PolygonFactory {

    static Polygon getPolygonObject(String name) {
        Polygon polygon = new Polygon();
        switch (name) {
            case "hexagonPolygon":
                polygon.setPolygonType(new Hexagon());

                break;
            case "rectananglePolygon":
                polygon.setPolygonType(new Rectangle());
                break;
            case "pentagonPolygon":
                polygon.setPolygonType(new Pentagon());
                break;
        }
        return polygon;

    }

    @Override
    public String toString() {
        return "PolygonFactory{}";
    }
}

public class Factory {
    public static void main(String[] args) {
        //TODO:Need to ask about the below statement.
        Polygon hexagonPolygon = PolygonFactory.getPolygonObject("hexagonPolygon");
        hexagonPolygon.getPolygonType().polygonType();
        // System.out.println("Area of Hexagon is"+trianglePolygon.getPolygonType().);
        //TODO:why is giving hashcode value.
        System.out.println(PolygonFactory.getPolygonObject("rectanglePolygon"));
    }
}
