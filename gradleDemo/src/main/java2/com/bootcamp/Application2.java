package com.bootcamp;

import org.apache.commons.lang3.StringUtils;

public class Application2 {

    public static void main(String[] args) {
       // Application application = new Application();
       // System.out.println(Application.test());
        System.out.println("Hello from java2");
        String str="MANISHA";
        String str1=str.toLowerCase();
        System.out.println(str1);
        System.out.println(StringUtils.join(new String[] { "AB", "CD", "EF" }, "YES"));
    }
}

