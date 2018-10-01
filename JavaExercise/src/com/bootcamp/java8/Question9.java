//Write data using print stream.
package com.bootcamp.java8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Question9 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "/home/manisha/Desktop/printstream.txt";
        FileOutputStream fout = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(fout);
        printStream.println(3027);
        printStream.println("Manisha");
        printStream.println("Goyal");
        try {
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
        System.out.println("Success ");

    }
}
