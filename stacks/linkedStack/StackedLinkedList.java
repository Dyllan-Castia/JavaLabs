package com.lesson.lab;

// StackLinkedList class to implement stack operations
public class StackLinkedList {
    // Node class to represent each element in the stack
    class Node {
        String data; // Data stored in the node (e.g., an action or text)
        Node next;   // Reference to the next node

        public Node(String data) {
            this.data = data;
            this.next = null; // Initialize the next node as null
        }
    }

    private Node top; // Top of the stack

    // Constructor to initialize the stack
    public StackLinkedList() {
        // TODO 1: set the top variable to null in the constructor to indicate an empty stack
        top = null;
    }

    // Push Operation - Add elements to the stack
    public void push(String action) {
        // TODO 2: create a new Node object with the action
        Node newNode = new Node(action);
        // TODO 3: set the next of new node to current top
        newNode.next = top;
        // TODO 4: update the top to new node
        top = newNode;
        // TODO 5: print a confirmation message
        System.out.println("Push success.");
    }

    //Pop Operation - Remove and return the top element of the stack
    public String pop() {
        // TODO 6: check if the stack is empty
        if (top == null) {
            System.out.println("Stack is empty.");
            return null; // TODO 7: print message if the stack is empty and return null
        } else {
            String poppedData = top.data; // TODO 8: store the data of the top node
            top = top.next; // TODO 9: update the top pointer to the next node
            System.out.print("Data popped: ");
            return poppedData; // TODO 10: print a confirmation message and return the removed data
        }
    }

    // Peek Operation - Display the top element without removing it
    public String peek() {
        // TODO 11: check if the stack is empty
        if (top == null) {
            System.out.println("Stack is empty.");
            return null; // TODO 12: print message if the stack is empty and return null
        } else {
            String peeked = top.data; // TODO 13: retrieve the data from the top node
            // TODO 14: print the top element data
            System.out.println("Data peaked: " + peeked);
            // TODO 15: return the data from the top node
            return peeked;
        }
    }

    // Display All Elements - List all elements in the stack
    public void display() {
        // TODO 16: check if the stack is empty by verifying if top is null.
        if (top == null) {
            System.out.println("Stack is empty");
            return; // TODO 17: if the stack is empty, print a message and return.
        } else {
            Node current = top; // TODO 18: initialize the current node to top.
            while (current != null) { // TODO 19: traverse the stack using a while loop.
                // TODO 20: print the data of the current node during each iteration.
                System.out.println(current.data);
                // TODO 21: update current to current.next to move to the next node.
                current = current.next;
            }
        }
    }
}
