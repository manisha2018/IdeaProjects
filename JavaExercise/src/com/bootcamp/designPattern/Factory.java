//Implement Factory Pattern to get the Polygon of differnt type.
package com.bootcamp.designPattern;

interface Polygon {
    void polygonType();
}

class Hexagon implements Polygon {

    private Integer side;

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;

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

class Rectangle implements Polygon {

    @Override
    public void polygonType() {
        System.out.println("This is a Rectangle Polygon");
    }
}

class Pentagon implements Polygon {

    @Override
    public void polygonType() {
        System.out.println("This is a Pentagon Polygon");
    }
}


class PolygonFactory {

    static Polygon getPolygonObject(String name) {
        Polygon polygon = null;
        switch (name) {
            case "hexagonPolygon":
                polygon = new Hexagon();

                break;
            case "rectananglePolygon":
                polygon = new Rectangle();
                break;
            case "pentagonPolygon":
                polygon = new Pentagon();
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

        Polygon hexagonPolygon = PolygonFactory.getPolygonObject("hexagonPolygon");
        hexagonPolygon.polygonType();
        PolygonFactory.getPolygonObject("hexagonPolygon").polygonType();

    }
}
