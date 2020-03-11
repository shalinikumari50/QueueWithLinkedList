package myQueue;

import node.Node;

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
            System.out.println("First element deleted");
        }

    }

    public void displayQueue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void deleteQueue() {
        start = null;
        end = null;
        System.out.println("Queue deleted!");
    }

    public void peek() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
            return;
        }
        System.out.println(start.getData());
    }

    public void printMenu() {
        System.out.println("press");
        System.out.println("0 - to quit\n" +
                "1 - to insert an element\n" +
                "2 - to display queue\n" +
                "3 - to delete an element\n" +
                "4 - to peek in queue\n" +
                "5 - to delete queue\n" +
                "6 - to print menu");
    }

}
