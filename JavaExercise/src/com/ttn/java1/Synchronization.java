package com.ttn.java1;

public class Synchronization {
    private int c=0;
    public void increement(){
        c++;
    }
    public void decreement(){
        c--;
    }
    public int display(){
        return c;
    }

    public static void main(String[] args) {
        Synchronization s=new Synchronization();
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s.increement();
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        });
    }
}
