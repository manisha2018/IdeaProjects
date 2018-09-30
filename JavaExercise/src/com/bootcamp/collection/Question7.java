/*
Design a Data Structure SpecialStack that supports all the stack operations
like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
*/

package com.bootcamp.collection;

import java.util.Stack;

public class Question7 extends Stack<Integer>
{

    Stack<Integer> integerStack = new Stack<>();

    void push(int x){

        if(isEmpty() == true){
            super.push(x);
            integerStack.push(x);
        }else{

            super.push(x);
            int y = integerStack.pop();
            integerStack.push(y);

            if(x < y){
                integerStack.push(x);
            }
            else {
                integerStack.push(y);
            }

        }

    }

    public Integer pop(){
        int x = super.pop();
        integerStack.pop();
        return x;
    }

    int getMin(){
        int x = integerStack.pop();
        integerStack.pop();
        return x;
    }

    public static void main(String[] args) {

        Question7 ques = new Question7();
        ques.push(10);
        ques.push(20);
        ques.push(30);
        System.out.println("----------->"+ques);
        System.out.println("----------->"+ques.getMin());
        ques.push(62);
        ques.push(2);
        System.out.println("----------->"+ques);
        System.out.println("Minimum element--->"+ques.getMin());

    }

}
