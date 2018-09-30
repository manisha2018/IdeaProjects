/* Write a program to display times in different country format.
 * */
package com.bootcamp.collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Question9 {
    public static void main(String[] args) {

        SimpleDateFormat indsdf = new SimpleDateFormat("dd/MM/yyyy zZ HH:mm:ss a");
        SimpleDateFormat usasdf = new SimpleDateFormat("MM/dd/yyyy zZ HH:mm:ss a");
        SimpleDateFormat paksdf = new SimpleDateFormat("yyyy-MM-dd zZ HH:mm:ss a");

        TimeZone ind = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone usa = TimeZone.getTimeZone("US/Central");
        TimeZone pakistan = TimeZone.getTimeZone("Asia/Karachi");

        indsdf.setTimeZone(ind);
        usasdf.setTimeZone(usa);
        paksdf.setTimeZone(pakistan);

        System.out.println("India Time format " + indsdf.format(new Date()));
        System.out.println("USA time format " + usasdf.format(new Date()));
        System.out.println("Pak time format " + paksdf.format(new Date()));

    }
}
