package main;

import datastructure.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.print();

        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.print();


    }
}
