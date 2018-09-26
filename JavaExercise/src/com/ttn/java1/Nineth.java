/*Write a program to display values of
enums using a constructor & getPrice() method (Example display house & their prices)*/

package com.ttn.java1;

public class Nineth {
    houseType type;
    Double price;
    String location;


    Nineth(Double price, String location) {

        this.price = price;
        this.location = location;

    }

    Double getPrice() {
        return this.price;
    }


    enum houseType {SMALL, BIG, HUGE}

    public static void main(String[] args) {

        Nineth house1 = new Nineth(3000.89, "Chandigarh");
        house1.type = houseType.SMALL;
        Nineth house2 = new Nineth(40000.78, "Goa");
        house2.type = houseType.BIG;
        Nineth house3 = new Nineth(5000000.7, "Malaysia");
        house3.type = houseType.HUGE;

        System.out.println("Price of house is " + house1.getPrice());
        System.out.println("Type of house is " + house1.type);
        System.out.println("Price of house is " + house2.getPrice());
        System.out.println("Type of house is " + house2.type);
        System.out.println("Price of house is " + house3.getPrice());
        System.out.println("Type of house is " + house3.type);

    }

}
