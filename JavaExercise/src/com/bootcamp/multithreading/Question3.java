//Print pattern 1 2 3 1 2 3.... using three different threads

package com.bootcamp.multithreading;

class Pattern implements Runnable {
    static Object monitor = new Object();
    static boolean one = true;
    static boolean two = false;
    static boolean three = false;
    int threadId;
    int i = 1;

    Pattern(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        print();
    }

    private void print() {
        try {
            while (i < 10) {
                Thread.sleep(500);
                synchronized (monitor) {
                    if (1 == threadId) {
                        if (!one) {
                            monitor.wait();
                        } else {
                            System.out.print(threadId + " ");
                            one = false;
                            two = true;
                            three = false;
                            monitor.notifyAll();
                        }
                    }
                    if (2 == threadId) {
                        if (!two) {
                            monitor.wait();
                        } else {
                            System.out.print(threadId + " ");
                            one = false;
                            two = false;
                            three = true;
                            monitor.notifyAll();
                        }
                    }

                    if (3 == threadId) {
                        if (!three) {
                            monitor.wait();
                        } else {
                            System.out.print(threadId + " ");
                            one = true;
                            two = false;
                            three = false;
                            monitor.notifyAll();
                        }
                    }

                }
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Question3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Pattern(1));
        Thread t2 = new Thread(new Pattern(2));
        Thread t3 = new Thread(new Pattern(3));
        t1.start();
        t2.start();
        t3.start();
        //t1.stop();
    }
}
