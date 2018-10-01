//Read and Write data using buffered input and ouput stream.
package com.bootcamp.java8;

import java.io.*;

public class Question8 {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(
                new FileOutputStream("/tmp/abc.txt")
        );

        bufferedOutputStream.write("manisha".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        BufferedInputStream bufferedInputStream=new BufferedInputStream(
                new FileInputStream("/tmp/abc.txt"));

        int i=0;
        while ((i= bufferedInputStream.read())!=-1){
            System.out.println((char)i);
        }
    }
}
