package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        stack = new String[size];
        // TODO 2: set initial top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        if (top == stack.length - 1) { // TODO 3: check if the stack is full
            System.out.println("Stack is full. Cannot push."); // TODO 4: print message if the stack is full
        } else {
            stack[++top] = action; // TODO 5: increment top and add action to the stack
            System.out.println("Action successfully added to stack."); // TODO 6: print confirmation message
        }
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        if (top == -1) { // TODO 7: Check if the stack is empty
            System.out.println("Stack is empty. Cannot pop.");
            return null; // TODO 8: Print message if the stack is empty and return null
        } else {
            String poppedVal = stack[top]; // TODO 9: Retrieve and remove the top action from the stack
            stack[top] = null;
            top--;
            // TODO 10: Print confirmation message, return and replace empty string with the undone action
            return poppedVal;
        }
    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        if (top == -1) {
            // TODO 12: Print message if the stack is empty and return null
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        else {
            // TODO 13: Return and replace empty string with the most recent action without removing it
            String action = stack[top];
            return "Top of stack: " + action;
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        if (top == -1) {
            System.out.println("Stack is empty."); // TODO 15: Print message if the stack is empty
        } else {
            for (int i = top; i >= 0; i--) { // TODO 16: Iterate through the stack and print each action
                System.out.println(stack[i]);
            }
            // TODO 17: Print a new line after displaying all actions
            System.out.println();
        }
    }
}
