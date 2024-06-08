package main;

import datastructure.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.getHeight();
        myStack.getTop();
        myStack.print();
        System.out.println();

        myStack.push(1);
        myStack.push(0);
        myStack.getHeight();
        myStack.getTop();
        myStack.print();
        System.out.println();

        myStack.pop();
        myStack.getHeight();
        myStack.getTop();
        myStack.print();
        System.out.println();
    }
}
