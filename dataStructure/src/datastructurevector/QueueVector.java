package datastructurevector;

public class QueueVector {
    private int length;
    private int[] vector;

    public QueueVector(int length) {
        this.length = 0;
        vector = new int[length];
    }

    public int getFirst() {
        return vector[0];
    }

    public int getLast() {
        if (length == 0) {
            return 0;
        }
        return vector[length - 1];
    }

    public int getLength() {
        return length;
    }

    public void enqueue(int dado) {
        if (!isFull()) {
            vector[length] = dado;
            length++;
        } else {
            System.out.println("List is full");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int aux = vector[0];

            if(length == 1) {
                vector[0] = 0;
            }

            for (int i = 0; i < length - 1; i++) {
                vector[i] = vector[i + 1];
                vector[i + 1] = 0;
            }

            length--;
            return aux;
        }
        return 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                System.out.println("Index: " + i + ", Data: " + vector[i]);
            }
        } else {
            System.out.println("List is empty");
        }
    }

    public boolean isFull() {
        return length == vector.length;
    }
}

class Main {
    public static void main(String[] args) {
        QueueVector queueVector = new QueueVector(5);
        queueVector.enqueue(1);
        queueVector.enqueue(2);
        queueVector.enqueue(3);
        queueVector.enqueue(4);
        queueVector.enqueue(5);
        System.out.println(queueVector.dequeue());
        System.out.println(queueVector.dequeue());
        System.out.println(queueVector.dequeue());
        System.out.println(queueVector.dequeue());
        System.out.println(queueVector.dequeue());
        System.out.println("First: " + queueVector.getFirst());
        System.out.println("Last: " + queueVector.getLast());
        System.out.println("Length: " + queueVector.getLength());

        queueVector.print();
    }
}
