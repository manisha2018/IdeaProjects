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
interface Calculation<T, R, P> {
    T operation(R a, P b);
//    default T operation2(R c){
//        System.out.println("hey");
//
//    }


    //    default void printMe(String s){
//        System.out.println(s);
//    }
}
    class Question1 {
        public static void main(String[] args) {
            Calculation<Boolean, Integer, Integer> greater = (a, b) -> (a > b) ? true : false;
            Calculation<String, String, String> concatenate = (a, b) -> a.concat(b);


//        Calculation<Integer,Integer> increement= a->a++;
//        increement.operation2(a);

            System.out.println(greater.operation(5, 6));
            System.out.println(concatenate.operation("Manisha", "Goyal"));


        }
    }
