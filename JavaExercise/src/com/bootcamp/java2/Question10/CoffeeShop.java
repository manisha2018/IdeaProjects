/*TODO:
 Design classes having attributes and method(only skeleton) for a coffee shop.
 There are three different actors in our scenario and i have listed the different actions they do also below

* Customer
  - Pays the cash to the cashier and places his order, get a token number back
  - Waits for the intimation that order for his token is ready
  - Upon intimation/notification he collects the coffee and enjoys his drink
  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served.
   Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)

* Cashier
  - Takes an order and payment from the customer
  - Upon payment, creates an order and places it into the order queue
  - Intimates the customer that he has to wait for his token and gives him his token
  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)

* Barista
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready
*
* */

package com.bootcamp.java2.Question10;

import java.util.Queue;

public class CoffeeShop {
}

class Customer {
    private String name;
    private int orderId;
    private double cashPaid;
    private String orderPlaced;
}

class Cashier {

    private Queue<Integer> orderQueue;
    private double paymentReceived;
    private String takesOrder;
    private int orderId;

    void insertInOrderQueue(int orderId) {
        orderQueue.add(orderId);
    }
}

class Barista extends Cashier {
    Queue<Integer> completeOrder;
    int currentOrder = completeOrder.peek();

    void sendNotification(int currentOrder) {
//Completed order

    }

}

