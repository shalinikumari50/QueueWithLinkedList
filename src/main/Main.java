package main;

import myQueue.MyQueue;
import node.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        Scanner scanner = new Scanner(System.in);
        myQueue.printMenu();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Enter choice : ");
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
                continue;
            }
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter element to be inserted");
                    try {
                        int element = Integer.parseInt(scanner.nextLine().trim());
                        myQueue.enqueue(new Node(element));
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid input");
                        continue;
                    }
                    break;
                case 2:
                    myQueue.displayQueue();
                    break;
                case 3:
                    myQueue.dequeue();
                    break;
                case 4:
                    myQueue.peek();
                    break;
                case 5:
                    myQueue.deleteQueue();
                    break;
                case 6:
                    myQueue.printMenu();
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
        }

        scanner.close();

    }
}

