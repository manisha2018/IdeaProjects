/*Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
* */
package com.ttn.java1;

public class Tenth {
    public int add(int a,int b) {
        return (a + b);
    }
    public double add(double a, double b)
    {
        return (a+b);

    }
    public float mul(float a, float b)
    {
        return (a*b);
    }
    public int mul(int a,int b)
    {
        return (a*b);
    }
    public String concatenate(String a,String b)
    {
        return(a+b);
    }
    public String concatenate(String a,String b,String c)
    {
        return(a+b+c);
    }



    public static void main(String args[])
    {
        Tenth tenth=new Tenth();
        System.out.println("Adding 2 integers " +tenth.add(10,20));
        System.out.println("Adding 2 double values " +tenth.add(10.5,20.5));
        System.out.println("Multiplying 2 integers " +tenth.mul(10,20));
        System.out.println("Multiplying 2 floats "+tenth.mul(10.5f,20.5f));
        System.out.println("Concatenating 2 strings "+tenth.concatenate("Good", "Morning"));
        System.out.println("Concatenating 3 strings "+tenth.concatenate("Good", "Morning", "Everyone"));



    }

}
