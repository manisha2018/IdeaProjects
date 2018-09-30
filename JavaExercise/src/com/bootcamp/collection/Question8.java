// Write a program to format date as example "21-March-2016"

package com.bootcamp.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

class Question8 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date = new Date();
        String dateToStr = simpleDateFormat.format(date);
        System.out.println(dateToStr);
    }
}
