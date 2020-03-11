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
}
