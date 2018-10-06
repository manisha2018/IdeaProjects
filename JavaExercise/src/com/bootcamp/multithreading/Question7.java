/*Implement a Pub-Sub model using following criteria:
    There is a queue (i.e list) with a certain capacity (say 10)
    M number of publisher and N number of subscriber sharing the queue.
    Publisher has to wait if queue capacity is full
    Subscriber will wait if queue is empty
    Use thread signaling (wait, notify / notifyAll)
*/
package com.bootcamp.multithreading;

import java.util.LinkedList;

public class Question7 {
    public static void main(String[] args) throws InterruptedException {
        final PubSub pc = new PubSub();
        Thread t1 = new Thread(() -> {
            try {
                pc.publisher();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                pc.subscriber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static class PubSub {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 10;
        int i=1;

        public void publisher() throws InterruptedException {
            int value = 0;
            while (i<22) {
                synchronized (this) {
                    if (list.size() == capacity) {
                        wait();
                    }
                    System.out.println("Publisher publish-" + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
                i++;
            }
        }

        public void subscriber() throws InterruptedException {
            while (i<22) {
                synchronized (this) {
                    if (list.size() == 0) {
                        wait();
                    }
                    int val = list.removeFirst();
                    System.out.println("Subscriber consumed-" + val);
                    notify();
                    Thread.sleep(1000);
                }
                i++;
            }
        }
    }
}
