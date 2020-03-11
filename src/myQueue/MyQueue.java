package myQueue;

import Node.Node;

public class MyQueue {
    private Node start;
    private Node end;

    public MyQueue() {
        start = null;
        end = null;
    }

    public void enqueue(Node newNode) {
        if (start == null) {
            start = newNode;
        } else {
            end.setNext(newNode);
        }
        end = newNode;
        System.out.println("Element inserted");
    }

    public void dequeue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
        } else {
            start = start.getNext();
        }
        System.out.println("First element deleted");
    }

}
