/*Write the following a functional interface and implement it using lambda:

 First number is greater than second number or not
            Parameter (int ,int ) Return boolean

 Increment the number by 1 and return incremented value
            Parameter (int) Return int

 Concatination of 2 string
          Parameter (String , String ) Return (String)

 Convert a string to uppercase and return
        Parameter (String) Return (String)


* */
package com.bootcamp.java8;

@FunctionalInterface
interface Calculation1<T, R, P> {
    T operation1(R a, P b);
}
@FunctionalInterface
interface Calculation2<T,R>{
    T operation2(R r);
}
    class Question1 {
        public static void main(String[] args) {
            Calculation1<Boolean, Integer, Integer> greater = (a, b) -> (a > b) ? true : false;
            Calculation1<String, String, String> concatenate = (a, b) -> a.concat(b);
            System.out.println("First Number is greater than second number or not:"
                                                    +greater.operation1(5, 6));
            System.out.println("Concatenation:"
                            +concatenate.operation1("Manisha", "Goyal"));

            Calculation2<Integer,Integer> increement = a->a+1;
            Calculation2<String,String> uppercase = a->a.toUpperCase();
            System.out.println("Increement number by one :"+increement.operation2(2));
            System.out.println("String in Uppercase:"+uppercase.operation2("abc"));

        }
    }
